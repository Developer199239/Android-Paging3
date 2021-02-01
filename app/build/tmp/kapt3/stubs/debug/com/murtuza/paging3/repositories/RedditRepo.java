package com.murtuza.paging3.repositories;

import java.lang.System;

/**
 * Created by Murtuza Rahman on 1/31/21.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/murtuza/paging3/repositories/RedditRepo;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "redditService", "Lcom/murtuza/paging3/networking/RedditService;", "kotlin.jvm.PlatformType", "fetchPosts", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/murtuza/paging3/models/RedditPost;", "app_debug"})
public final class RedditRepo {
    private final com.murtuza.paging3.networking.RedditService redditService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.murtuza.paging3.models.RedditPost>> fetchPosts() {
        return null;
    }
    
    public RedditRepo(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}