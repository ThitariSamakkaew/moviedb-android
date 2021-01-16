package com.thitari.themovie.data.model

import com.thitari.themovie.api.response.PageResponse

data class Movie(
    val id: Int,
    val popularity: Float,
    val poster_path: String,
    val title: String,
)

//fun PageResponse.toMovie(): Movie {
//    return page.result.toMovie()
//}
