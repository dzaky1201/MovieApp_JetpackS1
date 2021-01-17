package com.dzakyhdr.movieapp.ui.tvShow

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvShowViewModelTest {
    private lateinit var viewModel: TvShowViewModel

    @Before
    fun testGetTv() {
        viewModel = TvShowViewModel()
    }

    @Test
    fun getTvViewModel(){
        val tvShowEntities = viewModel.getTv()
        assertNotNull(tvShowEntities)
        assertEquals(10,tvShowEntities.size)
    }
}