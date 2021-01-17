package com.dzakyhdr.movieapp.ui.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.dzakyhdr.movieapp.R
import com.dzakyhdr.movieapp.data.MovieEntity
import com.dzakyhdr.movieapp.databinding.ItemMovieBinding
import com.dzakyhdr.movieapp.ui.detail.movie.DetailMovieActivity

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    private var listMovie = ArrayList<MovieEntity>()

    fun setMovie(movie: List<MovieEntity>?) {
        if (movie == null) return
        this.listMovie.clear()
        this.listMovie.addAll(movie)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movie = listMovie[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listMovie.size

    class MyViewHolder(private val binding: ItemMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(movie: MovieEntity) {
            with(binding) {
                txtTitle.text = movie.title
                txtOverview.text = movie.overview
                imgPoster.load(movie.poster) {
                    crossfade(600)
                    error(R.drawable.ic_error)
                }

               binding.itemMovie.setOnClickListener {
                   val intent = Intent(itemView.context, DetailMovieActivity::class.java).apply {
                       putExtra(DetailMovieActivity.EXTRA_TV, movie.movieId)
                   }
                   itemView.context.startActivity(intent)
               }
            }
        }

    }

}