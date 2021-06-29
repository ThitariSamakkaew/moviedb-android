package com.thitari.themovie.data.model

import com.thitari.themovie.api.response.DetailResponse

data class MovieDetail(
    val adult: Boolean,
    val budget: Int,
    val id: Int,
    val originalTitle: String,
    val overview: String,
    val posterPath: String,
    val popularity: Double,
    val releaseDate: String,
    val originalLanguage: String
)

fun DetailResponse.toDetail(): MovieDetail {
    return MovieDetail(
        adult = adult,
        budget = budget,
        id = id,
        originalTitle = originalTitle,
        overview = overview,
        posterPath = "https://image.tmdb.org/t/p/w500/$posterPath",
        popularity = popularity,
        releaseDate = releaseDate,
        originalLanguage = originalLanguage
    )
}
