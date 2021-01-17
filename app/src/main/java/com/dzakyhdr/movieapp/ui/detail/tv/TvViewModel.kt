package com.dzakyhdr.movieapp.ui.detail.tv

import androidx.lifecycle.ViewModel
import com.dzakyhdr.movieapp.data.DummyData
import com.dzakyhdr.movieapp.data.TvEntity

class TvViewModel: ViewModel() {
    private lateinit var tvId: String

    fun setSelectedTv(tvShowID: String) {
        this.tvId = tvShowID
    }

    fun getTvShowDetail(): TvEntity {
        lateinit var tvShow: TvEntity
        val tvEntities = DummyData.getTvMovie()
        for (tvEntity in tvEntities){
            if (tvEntity.tvId == tvId){
                tvShow = tvEntity
            }
        }

        return tvShow
    }
}