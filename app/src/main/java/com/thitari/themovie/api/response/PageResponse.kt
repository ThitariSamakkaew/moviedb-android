@file:JvmName("MovieResponseKt")

package com.thitari.themovie.api.response

import com.google.gson.annotations.SerializedName

data class PageResponse(
    @SerializedName("page") val page: Int,
    @SerializedName("results") val results: List<MovieResponse>,
    @SerializedName("total_pages") val totalPages: Int,
    @SerializedName("total_results ") val totalResults: Int
)
