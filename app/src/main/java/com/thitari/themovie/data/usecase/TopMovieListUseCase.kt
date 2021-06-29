package com.thitari.themovie.data.usecase

import com.thitari.themovie.data.error.AppError
import com.thitari.themovie.data.model.Movie
import com.thitari.themovie.data.repository.MovieRepository
import javax.inject.Inject

class TopMovieListUseCase @Inject constructor(private val topRepository: MovieRepository) :
    BaseUseCase<Unit, List<Movie>>(::AppError) {

    override suspend fun run(params: Unit): List<Movie> =
        topRepository.getTopListMovies(page = 1).result
}
