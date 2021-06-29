package com.thitari.themovie.data.repository

import com.thitari.themovie.api.response.*
import com.thitari.themovie.api.service.MovieService
import com.thitari.themovie.data.model.*
import javax.inject.Inject

interface MovieRepository {

    suspend fun getPopularListMovies(page: Int): Page

    suspend fun getUpcomingListMovies(page: Int): Page

    suspend fun getTopListMovies(page: Int): Page

    suspend fun getMovieDetail(movieId: Int): MovieDetail

}

class MovieRepositoryImpl @Inject constructor(private val service: MovieService) :
    MovieRepository {

    override suspend fun getPopularListMovies(page: Int): Page {
        val response: PageResponse = service.popularMovie(page)
        return response.toPage()
    }

    override suspend fun getUpcomingListMovies(page: Int): Page {
        val response: PageResponse = service.upcomingMovie(page)
        return response.toPage()
    }

    override suspend fun getTopListMovies(page: Int): Page {
        val response: PageResponse = service.topMovie(page)
        return response.toPage()
    }

    override suspend fun getMovieDetail(movieId: Int): MovieDetail {
        val response: DetailResponse = service.detailMovie(movieId)
        return response.toDetail()
    }

}
