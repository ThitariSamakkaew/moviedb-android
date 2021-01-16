package com.thitari.themovie.api.response

import java.util.*

class MovieResponse(
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: IntArray,
    val id : Int,
    val original_language : String,
    val original_title : String,
    val overview : String,
    val popularity : Int,
    val poster_path : String,
    val release_date : Date,
    val title : String,
    val video : Boolean,
    val vote_average : Float,
    val vote_count : Int
)
