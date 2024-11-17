package com.example.vridap.data.remote.repository.repoImplementation

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.vridap.data.remote.dto.BlogResponse
import com.example.vridap.data.remote.repository.repo.BlogRepo
import com.example.vridap.data.remote.service.BlogApiService
import com.example.vridap.data.remote.util.BlogPagingSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class BlogRepoImplementation @Inject constructor(
    private val apiService : BlogApiService
) : BlogRepo{

    override fun getBlogs(): Flow<PagingData<BlogResponse>> {
        val blogPagingSource = BlogPagingSource(apiService = apiService)

        return Pager(
            config = PagingConfig(
                pageSize = 10,
                enablePlaceholders = false
            ),
            pagingSourceFactory = {
                blogPagingSource
            }
        ).flow
    }

}