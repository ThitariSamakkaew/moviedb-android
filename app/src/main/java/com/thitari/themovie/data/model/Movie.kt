package com.thitari.themovie.data.model

import com.thitari.themovie.api.response.MovieResponse

data class Movie(
    val id: Int,
    val imageUrl: String,
    val title: String,
    val rating: Float,
    val releaseDate: String
)

// List<MovieResponse> -> List<Movie>
fun List<MovieResponse>.toMovies() = this.map { response -> response.toMovie() }

// MovieResponse -> Movie
fun MovieResponse.toMovie(): Movie {
    return Movie(
        id = id,
        imageUrl = "https://image.tmdb.org/t/p/w500/$posterPath",
        title = title,
        rating = popularity,
        releaseDate = releaseDate
    )
}
