package com.dzakyhdr.movieapp.ui.tvShow

import androidx.lifecycle.ViewModel
import com.dzakyhdr.movieapp.data.DummyData
import com.dzakyhdr.movieapp.data.TvEntity

class TvShowViewModel: ViewModel() {
    fun getTv(): List<TvEntity> = DummyData.getTvMovie()
}