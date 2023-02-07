package com.example.freegame.presentation.listGameFragment

import androidx.recyclerview.widget.DiffUtil
import com.example.freegame.domain.model.ListGameItem

class DiffCallBack : DiffUtil.ItemCallback<ListGameItem>() {

    override fun areItemsTheSame(oldItem: ListGameItem, newItem: ListGameItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ListGameItem, newItem: ListGameItem): Boolean {
        return oldItem == newItem
    }
}
