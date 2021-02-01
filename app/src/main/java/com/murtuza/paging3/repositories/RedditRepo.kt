package com.murtuza.paging3.repositories

import android.content.Context
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.murtuza.paging3.models.RedditPost
import com.murtuza.paging3.networking.RedditClient
import com.murtuza.paging3.networking.RedditService
import kotlinx.coroutines.flow.Flow

/**
 * Created by Murtuza Rahman on 1/31/21.
 */
class RedditRepo(context: Context) {
    private val redditService = RedditClient.getClient().create(RedditService::class.java)

    fun fetchPosts(): Flow<PagingData<RedditPost>> {
        // 3
        return Pager(
            PagingConfig(pageSize = 10, enablePlaceholders = false)
        ) {
            RedditPagingSource(redditService)
        }.flow
    }

}