package com.murtuza.paging3.repositories

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.murtuza.paging3.models.RedditPost
import com.murtuza.paging3.networking.RedditService
import retrofit2.HttpException
import java.io.IOException

/**
 * Created by Murtuza Rahman on 1/31/21.
 */
class RedditPagingSource(private val redditService: RedditService) :
    PagingSource<String, RedditPost>() {
    override suspend fun load(params: LoadParams<String>): LoadResult<String, RedditPost> {
        return try {
            val response = redditService.fetchPosts(loadSize = params.loadSize)
            val listing = response.body()?.data
            val redditPosts = listing?.children?.map { it.data }
            LoadResult.Page(
                redditPosts ?: listOf(),
                listing?.before,
                listing?.after
            )
        } catch (exception: IOException) {
           return LoadResult.Error(exception)
        } catch (exception: HttpException) {
            return LoadResult.Error(exception)
        }
    }

    override fun getRefreshKey(state: PagingState<String, RedditPost>): String? {
        TODO("Not yet implemented")
    }

}