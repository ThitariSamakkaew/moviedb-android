package com.thitari.themovie.data.repository

import com.thitari.themovie.api.response.PageResponse
import com.thitari.themovie.api.service.MovieService
import com.thitari.themovie.data.model.Page
import com.thitari.themovie.data.model.toPage
import javax.inject.Inject

interface MovieRepository {

    suspend fun getPopularMovies(page: Int): Page
}

class MovieRepositoryImpl @Inject constructor(private val service: MovieService) :
    MovieRepository {

    override suspend fun getPopularMovies(page: Int): Page {
        val response: PageResponse = service.popularMovie(page)
        return response.toPage()
    }
}
