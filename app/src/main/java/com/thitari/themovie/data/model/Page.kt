package com.thitari.themovie.data.model


import com.thitari.themovie.api.response.PageResponse

data class Page(
    val pageNumber: Int,
    val result: List<Movie>,
    val totalPages: Int,
    val totalResults: Int
)

fun PageResponse.toPage(): Page {
    return Page(
        pageNumber = page,
        result = results.toMovies(),
        totalPages = totalPages,
        totalResults = totalResults
    )
}
