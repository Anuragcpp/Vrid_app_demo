package com.example.vridap.ui.screens.mainScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.vridap.data.remote.dto.BlogResponse
import com.example.vridap.data.remote.repository.repoImplementation.BlogRepoImplementation
import com.example.vridap.data.remote.service.BlogApiService
import com.example.vridap.utaliti.constants.Endpoint
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel  @Inject constructor() : ViewModel(){

    //initiate the api service
    private val apiService = Endpoint.retrofitClient.createService(BlogApiService::class.java)

    //initialize repository
    private val repository = BlogRepoImplementation(apiService)

    fun getBlogs() : Flow<PagingData<BlogResponse>> {
        return repository.getBlogs().cachedIn(viewModelScope)
    }
}