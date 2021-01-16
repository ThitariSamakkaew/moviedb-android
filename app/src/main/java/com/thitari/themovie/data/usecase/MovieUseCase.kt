package com.thitari.themovie.data.usecase

import com.thitari.themovie.data.error.AppError
import com.thitari.themovie.data.model.Movie
import com.thitari.themovie.data.repository.MovieRepository
import javax.inject.Inject

class MovieUseCase @Inject constructor(private val movieRepository: MovieRepository) :
    BaseUseCase<Unit, Movie>(::AppError) {

    override suspend fun run(params: Unit): Movie {
        return movieRepository.getPopularMovie(
            page = 1,
            apiKey = "1b695a7e9114672b94ecb61f22345998"
        )
    }
}
