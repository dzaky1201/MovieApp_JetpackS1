package com.dzakyhdr.movieapp.ui.detail.movie

import com.dzakyhdr.movieapp.data.DummyData
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailMovieViewModelTest {

    private lateinit var viewModel: DetailMovieViewModel
    private val dummyMovie = DummyData.getMovie()[0]
    private val movieId = dummyMovie.movieId

    @Before
    fun setup(){
        viewModel = DetailMovieViewModel()
        viewModel.setSelectedMovie(movieId)
    }


    @Test
    fun getMovieDetail() {
        viewModel.setSelectedMovie(dummyMovie.movieId)
        val movieEntities = viewModel.getMovieDetail()
        assertNotNull(movieEntities)
        assertEquals(dummyMovie.movieId, movieEntities.movieId)
        assertEquals(dummyMovie.title, movieEntities.title)
        assertEquals(dummyMovie.genre, movieEntities.genre)
        assertEquals(dummyMovie.years, movieEntities.years)
        assertEquals(dummyMovie.poster, movieEntities.poster)
    }

}