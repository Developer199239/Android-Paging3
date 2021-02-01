package com.murtuza.paging3.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.murtuza.paging3.models.RedditPost
import com.murtuza.paging3.repositories.RedditRepo
import kotlinx.coroutines.flow.Flow

/**
 * Created by Murtuza Rahman on 1/31/21.
 */

class RedditViewModel(application: Application) : AndroidViewModel(application) {
    private val redditRepo = RedditRepo(application)

    fun fetchPosts(): Flow<PagingData<RedditPost>> {
        return redditRepo.fetchPosts().cachedIn(viewModelScope)
    }
}