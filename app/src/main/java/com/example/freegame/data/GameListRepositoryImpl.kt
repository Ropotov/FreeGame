package com.example.freegame.data

import com.example.freegame.data.api.RetrofitInstance
import com.example.freegame.domain.GameListRepository
import com.example.freegame.domain.model.DetailGameItem
import com.example.freegame.domain.model.ListGameItem

class GameListRepositoryImpl : GameListRepository {

    private val mapper = GameMapper()
    override suspend fun getListGame(): List<ListGameItem> {
        val list = RetrofitInstance.api.getListGame()
        return mapper.mapListGameItemDtoToListGameItem(list)
    }

    override suspend fun getGameToId(id: Int): DetailGameItem {
        val gameItem = RetrofitInstance.api.getGameToId(id)
        return mapper.mapDetailGameItemDtoToDetailGameItem(gameItem)
    }
}