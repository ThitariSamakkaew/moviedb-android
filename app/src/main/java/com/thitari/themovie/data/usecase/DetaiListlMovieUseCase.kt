package com.thitari.themovie.data.usecase

import com.thitari.themovie.data.error.AppError
import com.thitari.themovie.data.model.MovieDetail
import com.thitari.themovie.data.repository.MovieRepository
import javax.inject.Inject

class DetailListMovieUseCase @Inject constructor(private val detailListMovieRepository: MovieRepository) :
    BaseUseCase<Int, MovieDetail>(::AppError) {
    override suspend fun run(params: Int): MovieDetail {
        return detailListMovieRepository.getMovieDetail(movieId = params)
    }
}

