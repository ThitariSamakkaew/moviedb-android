package com.thitari.themovie.data.repository

import com.thitari.themovie.api.response.PageResponse
import com.thitari.themovie.api.service.MovieService
import com.thitari.themovie.data.model.Movie
import javax.inject.Inject

interface MovieRepository {

    suspend fun getPopularMovie(page: Int, apiKey: String): Movie
}

class MovieRepositoryImpl @Inject constructor(private val service: MovieService) :
    MovieRepository {

    override suspend fun getPopularMovie(page: Int, apiKey: String): Movie {
        val response: PageResponse = service.popularMovie(page, apiKey)
        return  Movie(1, 11.11F, " jh", "mm")
    }
}
