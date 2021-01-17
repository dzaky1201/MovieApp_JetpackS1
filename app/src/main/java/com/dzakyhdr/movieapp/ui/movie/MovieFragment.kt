package com.dzakyhdr.movieapp.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dzakyhdr.movieapp.R
import com.dzakyhdr.movieapp.databinding.FragmentMovieBinding

class MovieFragment : Fragment() {

    private lateinit var binding: FragmentMovieBinding
    private lateinit var viewModel: MovieViewModel
    private lateinit var mAdapter: MovieAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMovieBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity != null){
            viewModel = ViewModelProvider(this,ViewModelProvider.NewInstanceFactory())[MovieViewModel::class.java]

            val movie = viewModel.getMovie()
            mAdapter = MovieAdapter()
            mAdapter.setMovie(movie)

            with(binding.rvMovie){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = mAdapter
            }
        }
    }

}