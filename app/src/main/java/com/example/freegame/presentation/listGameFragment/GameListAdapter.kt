package com.example.freegame.presentation.listGameFragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.freegame.databinding.ItemGameBinding
import com.example.freegame.domain.model.ListGameItem


class GameListAdapter : ListAdapter<ListGameItem, GameListViewHolder>(DiffCallBack()) {

    var onGameClickListener: ((ListGameItem) -> Unit)? = null

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
        holder.binding.root.setOnClickListener {
            onGameClickListener?.invoke(gamePosition)
        }
    }
}
