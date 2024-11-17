package com.example.vridap.data.remote.repository.repo

import androidx.paging.PagingData
import com.example.vridap.data.remote.dto.BlogResponse
import kotlinx.coroutines.flow.Flow

interface BlogRepo {

    fun getBlogs() : Flow<PagingData<BlogResponse>>
}