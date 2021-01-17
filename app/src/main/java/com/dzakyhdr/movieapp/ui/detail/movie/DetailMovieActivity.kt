package com.dzakyhdr.movieapp.ui.detail.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import coil.load
import com.dzakyhdr.movieapp.R
import com.dzakyhdr.movieapp.data.MovieEntity
import com.dzakyhdr.movieapp.databinding.ActivityDetailMovieBinding

class DetailMovieActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TV = "extra_tv"
    }

    private lateinit var binding: ActivityDetailMovieBinding
    private lateinit var viewModel: DetailMovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailMovieViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getString(EXTRA_TV)
            if (movieId != null) {
                viewModel.setSelectedMovie(movieId)
                showDetail(viewModel.getMovieDetail())
            }

        }

    }

    private fun showDetail(movieDetail: MovieEntity) {
        with(binding) {

            imgDetail.load(movieDetail.poster) {
                crossfade(600)
                error(R.drawable.ic_error)
            }

            tvTitle.text = movieDetail.title
            tvGenre.text = movieDetail.genre
            tvYears.text = movieDetail.years
            tvDetail.text = movieDetail.overview
        }


    }
}