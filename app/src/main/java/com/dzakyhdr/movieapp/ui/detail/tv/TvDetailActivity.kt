package com.dzakyhdr.movieapp.ui.detail.tv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import coil.load
import com.dzakyhdr.movieapp.R
import com.dzakyhdr.movieapp.data.TvEntity
import com.dzakyhdr.movieapp.databinding.ActivityTvDetailBinding

class TvDetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TV_SHOW = "extra_tv"
    }

    private lateinit var binding: ActivityTvDetailBinding
    private lateinit var viewModel: TvViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTvDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        viewModel =
            ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TvViewModel::class.java]

        val bundle = intent.extras
        if (bundle != null){
            val tvShowId = bundle.getString(EXTRA_TV_SHOW)
            if (tvShowId != null){
                viewModel.setSelectedTv(tvShowId)
                getDetailTvShow(viewModel.getTvShowDetail())
            }
        }
    }

    private fun getDetailTvShow(tvShowDetail: TvEntity) {
        with(binding){
            tvTitle.text = tvShowDetail.title
            tvGenre.text = tvShowDetail.genre
            tvYears.text = tvShowDetail.years
            tvDetail.text = tvShowDetail.overview
            imgDetail.load(tvShowDetail.poster){
                crossfade(600)
                error(R.drawable.ic_error)
            }
        }
    }
}