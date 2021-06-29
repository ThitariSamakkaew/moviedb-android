package com.thitari.themovie.ui.screen.main.fragment.main.detail

import com.thitari.themovie.data.model.MovieDetail

class MovieDetailUiModel (
    val adult: Boolean,
    val budget: String,
    val id: Int,
    val originalTitle: String,
    val overview: String,
    val posterPath: String,
    val popularity: Double,
    val releaseDate: String,
    val originalLanguage: String
)

fun MovieDetail.toMovieDetailUiModel()= MovieDetailUiModel(
    id = id,
    adult = adult,
    budget = "$ $budget",
    originalTitle = originalTitle,
    overview = overview,
    posterPath = posterPath,
    popularity = popularity,
    releaseDate = releaseDate,
    originalLanguage = originalLanguage
)
