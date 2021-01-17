package com.dzakyhdr.movieapp.ui.detail.movie

import androidx.lifecycle.ViewModel
import com.dzakyhdr.movieapp.data.DummyData
import com.dzakyhdr.movieapp.data.MovieEntity

class DetailMovieViewModel: ViewModel() {
    private lateinit var movieId: String

    fun setSelectedMovie(movieId: String) {
        this.movieId = movieId
    }

    fun getMovieDetail(): MovieEntity{
        lateinit var movie: MovieEntity
        val movieEntities = DummyData.getMovie()
        for (movieEntity in movieEntities){
            if (movieEntity.movieId == movieId){
                movie = movieEntity
            }
        }

        return movie
    }
}
