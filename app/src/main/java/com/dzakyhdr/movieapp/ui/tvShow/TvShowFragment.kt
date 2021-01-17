package com.dzakyhdr.movieapp.ui.tvShow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dzakyhdr.movieapp.R
import com.dzakyhdr.movieapp.databinding.FragmentTvShowBinding

class TvShowFragment : Fragment() {
    private lateinit var binding: FragmentTvShowBinding
    private lateinit var vieModel: TvShowViewModel
    private lateinit var mAdapter: TvAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTvShowBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        vieModel = ViewModelProvider(this,ViewModelProvider.NewInstanceFactory())[TvShowViewModel::class.java]

        val tv = vieModel.getTv()
        mAdapter = TvAdapter()
        mAdapter.setTv(tv)

        with(binding.rvTv){
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = mAdapter
        }


    }

}