package com.thitari.themovie.data.repository

import com.thitari.themovie.api.response.PageResponse
import com.thitari.themovie.api.service.MovieService
import com.thitari.themovie.data.model.Page
import com.thitari.themovie.data.model.toPage
import javax.inject.Inject

interface MovieRepository {

    suspend fun getPopularMovies(page: Int): Page

    suspend fun getUpcomingMovie(page: Int): Page

    suspend fun getTopMovie(page: Int): Page
}

class MovieRepositoryImpl @Inject constructor(private val service: MovieService) :
    MovieRepository {

    override suspend fun getPopularMovies(page: Int): Page {
        val response: PageResponse = service.popularMovie(page)
        return response.toPage()
    }

    override suspend fun getUpcomingMovie(page: Int): Page {
        val response: PageResponse = service.upcomingMovie(page)
        return response.toPage()
    }

    override suspend fun getTopMovie(page: Int): Page {
        val response: PageResponse = service.topMovie(page)
        return response.toPage()
    }
}
