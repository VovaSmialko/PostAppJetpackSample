package com.smialko.postappjetpacksample.ui.theme.presentation

import com.smialko.postappjetpacksample.domain.FeedPost

sealed class NewsFeedScreenState {

    data object Initial : NewsFeedScreenState()

    data class Posts(val posts: List<FeedPost>) : NewsFeedScreenState()
}