package com.thitari.themovie.data.usecase

import com.thitari.themovie.data.error.AppError
import com.thitari.themovie.data.model.MovieDetail
import com.thitari.themovie.data.repository.MovieRepository
import javax.inject.Inject

class DetailUseCase @Inject constructor(private val detailRepository: MovieRepository) :
    BaseUseCase<Unit, MovieDetail>(::AppError) {

    override suspend fun run(params: Unit): MovieDetail {
        return detailRepository.getMovieDetail(movieId = 464052)
    }
}
