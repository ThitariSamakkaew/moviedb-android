package com.thitari.themovie.api.service

import com.thitari.themovie.api.response.DetailResponse
import com.thitari.themovie.api.response.PageResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {

    @GET("movie/popular")
    suspend fun popularMovie(
        @Query("page") page: Int,
        @Query("api_key") apiKey: String = "1b695a7e9114672b94ecb61f22345998"
    ): PageResponse

    @GET("movie/upcoming")
    suspend fun upcomingMovie(
        @Query("page") page: Int,
        @Query("api_key") apiKey: String = "1b695a7e9114672b94ecb61f22345998"
    ): PageResponse

    @GET("movie/top_rated")
    suspend fun topMovie(
        @Query("page") page: Int,
        @Query("api_key") apiKey: String = "1b695a7e9114672b94ecb61f22345998"
    ): PageResponse

    @GET("movie/{movieId}")
    suspend fun detailMovie(
        @Path("movieId") movieId: Int,
        @Query("api_key") apiKey: String = "1b695a7e9114672b94ecb61f22345998"
    ): DetailResponse
}
