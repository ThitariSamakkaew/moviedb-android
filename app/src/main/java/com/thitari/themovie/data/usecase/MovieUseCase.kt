package com.thitari.themovie.data.usecase

import com.thitari.themovie.data.error.AppError
import com.thitari.themovie.data.model.Page
import com.thitari.themovie.data.repository.MovieRepository
import javax.inject.Inject

class MovieUseCase @Inject constructor(private val movieRepository: MovieRepository) :
    BaseUseCase<Unit, Page>(::AppError) {

    override suspend fun run(params: Unit): Page {
        return movieRepository.getPopularListMovies(
            page = 1
        )
    }
}
