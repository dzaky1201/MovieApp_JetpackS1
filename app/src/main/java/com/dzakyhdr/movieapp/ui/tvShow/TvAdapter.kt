package com.dzakyhdr.movieapp.ui.tvShow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.dzakyhdr.movieapp.R
import com.dzakyhdr.movieapp.data.TvEntity
import com.dzakyhdr.movieapp.databinding.ItemTvBinding
import com.dzakyhdr.movieapp.ui.detail.tv.TvDetailActivity

class TvAdapter: RecyclerView.Adapter<TvAdapter.TvViewHolder>() {

    private val listTv = ArrayList<TvEntity>()

    fun setTv(tv: List<TvEntity>?){
        if (tv == null) return
        this.listTv.clear()
        this.listTv.addAll(tv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvViewHolder {
        val binding = ItemTvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TvViewHolder, position: Int) {
        val tv = listTv[position]
        holder.bind(tv)
    }

    override fun getItemCount(): Int = listTv.size

    class TvViewHolder(private val binding: ItemTvBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(tvEntity: TvEntity){
            with(binding){
                txtTitle.text = tvEntity.title
                txtOverview.text = tvEntity.overview
                imgPoster.load(tvEntity.poster){
                    crossfade(600)
                    error(R.drawable.ic_error)
                }

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, TvDetailActivity::class.java).apply {
                        putExtra(TvDetailActivity.EXTRA_TV_SHOW, tvEntity.tvId)
                    }
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
}