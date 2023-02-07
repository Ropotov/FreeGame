package com.example.freegame.presentation.listGameFragment

import androidx.recyclerview.widget.DiffUtil
import com.example.freegame.data.dto.ListGameItemDto

class DiffCallBack : DiffUtil.ItemCallback<ListGameItemDto>() {

    override fun areItemsTheSame(oldItem: ListGameItemDto, newItem: ListGameItemDto): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ListGameItemDto, newItem: ListGameItemDto): Boolean {
        return oldItem == newItem
    }
}
