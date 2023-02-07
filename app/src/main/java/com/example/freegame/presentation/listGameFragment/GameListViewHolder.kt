package com.example.freegame.presentation.listGameFragment

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.freegame.databinding.ItemGameBinding
import com.example.freegame.domain.model.ListGameItem

class GameListViewHolder(val binding: ItemGameBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(position: ListGameItem) {
        with(binding) {
            tvGameName.text = position.title
            tvDateRealise.text = position.release_date
            tvPlatform.text = position.platform
            Glide.with(ivGamePoster).load(position.thumbnail).into(ivGamePoster)
        }
    }
}
