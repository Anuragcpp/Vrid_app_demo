package com.example.vridap.data.remote.util

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.vridap.data.remote.dto.BlogResponse
import com.example.vridap.data.remote.service.BlogApiService

class BlogPagingSource (
    private val apiService: BlogApiService
) : PagingSource<Int,BlogResponse>() {

    override fun getRefreshKey(state: PagingState<Int, BlogResponse>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?:state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, BlogResponse> {
        try {

            val currentPage = params.key ?: 1

            val blog = apiService.getBlogs(
                currentPage,
                pageSize = 10
            )

            Log.d("api call" , "data fetch successfully")
            return LoadResult.Page(
                data = blog.body()!!,
                prevKey = if (currentPage == 0) null else currentPage - 1,
                nextKey = if (blog.body()!!.isEmpty()) null else currentPage + 1
            )

        }catch (e : Exception) {
            return LoadResult.Error(e)
        }
    }
}