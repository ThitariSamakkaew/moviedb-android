package com.thitari.themovie.ui.screen.main.fragment.main.list

import com.thitari.themovie.data.model.Movie

data class MovieUiModel(
    val id: Int,
    val popularity: Float,
    val posterPath: String,
    val title: String
)

fun Movie.toPopularUiModel() = MovieUiModel(
    id = id,
    popularity = popularity,
    posterPath = poster_path,
    title = title
)
