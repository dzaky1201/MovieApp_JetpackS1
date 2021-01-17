package com.dzakyhdr.movieapp.ui.detail.tv

import com.dzakyhdr.movieapp.data.DummyData
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class TvViewModelTest{
    private lateinit var viewModel: TvViewModel
    private val dummyTv = DummyData.getTvMovie()[0]
    private val tvShowId = dummyTv.tvId

    @Before
    fun setup(){
        viewModel = TvViewModel()
        viewModel.setSelectedTv(tvShowId)
    }

    @Test
    fun getTvShowDetail(){
        viewModel.setSelectedTv(tvShowId)
        val tvShowEntities = viewModel.getTvShowDetail()
        assertNotNull(tvShowEntities)
        assertEquals(dummyTv.tvId, tvShowEntities.tvId)
        assertEquals(dummyTv.title, tvShowEntities.title)
        assertEquals(dummyTv.genre, tvShowEntities.genre)
        assertEquals(dummyTv.years, tvShowEntities.years)
        assertEquals(dummyTv.poster, tvShowEntities.poster)
    }
}