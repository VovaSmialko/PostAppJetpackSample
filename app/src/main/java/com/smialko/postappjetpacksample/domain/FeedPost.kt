package com.smialko.postappjetpacksample.domain

import com.smialko.postappjetpacksample.R

data class FeedPost(
    val id: Int = 0,
    val communityName: String = "/news.grp",
    val publishDate: String = "14:00",
    val avatarResId: Int = R.drawable.post_comunity_thumbnail,
    val contentText: String = "Make America great again",
    val contentImageResId: Int = R.drawable.post_content_image,
    val statistics: List<StatisticItem> = listOf(
        StatisticItem(type = StatisticType.VIEWS, 966),
        StatisticItem(type = StatisticType.SHARES, 7),
        StatisticItem(type = StatisticType.COMMENTS, 8),
        StatisticItem(type = StatisticType.LIKES, 33)
    )
)