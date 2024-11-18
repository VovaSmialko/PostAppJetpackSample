package com.smialko.postappjetpacksample.domain

import com.smialko.postappjetpacksample.R

data class PostComment(
    val id: Int,
    val authorName: String = "Author",
    val authorAvatarId: Int = R.drawable.comment_author_avatar,
    val commentText:String = "Great again",
    val publicationDate: String = "14:00"
)
