package com.thitari.themovie.api.service

import com.thitari.themovie.api.response.PageResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {

    @GET("movie/popular")
    suspend fun popularMovie(
        @Query("page") page: Int,
        @Query("api_key") apiKey: String = "1b695a7e9114672b94ecb61f22345998"
    ): PageResponse


}
