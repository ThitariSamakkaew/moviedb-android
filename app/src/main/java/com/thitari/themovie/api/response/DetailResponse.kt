package com.thitari.themovie.api.response

import com.google.gson.annotations.SerializedName

data class DetailResponse(
    @SerializedName("adult") val adult: Boolean,
    @SerializedName("budget") val budget: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("original_title") val originalTitle: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("poster_path") val posterPath: String,
    @SerializedName("popularity") val popularity: Float,
    @SerializedName("original_language") val originalLanguage: String,
    @SerializedName("release_date") val releaseDate: String
)
