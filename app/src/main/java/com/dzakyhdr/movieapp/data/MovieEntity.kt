package com.dzakyhdr.movieapp.data

data class MovieEntity(
    var movieId: String,
    var title: String,
    var years: String,
    var overview: String,
    var genre: String,
    var launch: String,
    var poster: Int
)