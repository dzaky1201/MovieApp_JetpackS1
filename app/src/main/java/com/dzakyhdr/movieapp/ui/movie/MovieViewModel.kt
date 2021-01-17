package com.dzakyhdr.movieapp.ui.movie

import androidx.lifecycle.ViewModel
import com.dzakyhdr.movieapp.data.DummyData
import com.dzakyhdr.movieapp.data.MovieEntity

class MovieViewModel: ViewModel() {

    fun getMovie(): List<MovieEntity> = DummyData.getMovie()
}