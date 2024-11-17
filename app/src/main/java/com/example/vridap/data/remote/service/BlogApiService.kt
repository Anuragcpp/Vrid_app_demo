package com.example.vridap.data.remote.service

import com.example.vridap.data.remote.dto.BlogResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface BlogApiService {

    @GET("posts")
    suspend fun getBlogs(
        @Query("page") page : Int,
        @Query("per_page") pageSize : Int
    ) : Response<List<BlogResponse>>
}