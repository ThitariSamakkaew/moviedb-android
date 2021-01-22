package com.thitari.themovie.ui.screen.main.fragment.main.list

import com.thitari.themovie.data.model.Movie

data class MovieUiModel(
    val id: Int,
    val imageUrl: String,
    val title: String,
    val rating: Float,
    val releaseDate: String
)

fun Movie.toPopularUiModel() = MovieUiModel(
    id = id,
    imageUrl = imageUrl,
    title = title,
    rating = rating,
    releaseDate = releaseDate
)
