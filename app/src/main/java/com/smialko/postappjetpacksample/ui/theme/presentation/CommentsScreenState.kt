package com.smialko.postappjetpacksample.ui.theme.presentation

import com.smialko.postappjetpacksample.domain.FeedPost
import com.smialko.postappjetpacksample.domain.PostComment

sealed class CommentsScreenState {

    data object Initial : CommentsScreenState()

    data class Comments(
        val feedPost: FeedPost,
        val comments: List<PostComment>
    ) :
        CommentsScreenState()
}