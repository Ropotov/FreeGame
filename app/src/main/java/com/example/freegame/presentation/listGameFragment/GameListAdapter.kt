package com.example.freegame.presentation.listGameFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.freegame.data.dto.ListGameItemDto
import com.example.freegame.databinding.ItemGameBinding


class GameListAdapter : ListAdapter<ListGameItemDto, GameListViewHolder>(DiffCallBack()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameListViewHolder {
        val binding = ItemGameBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return GameListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GameListViewHolder, position: Int) {
        val gamePosition = getItem(position)
        holder.bind(gamePosition)
    }

}
