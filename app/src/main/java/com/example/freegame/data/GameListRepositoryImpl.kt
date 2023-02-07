package com.example.freegame.data

import com.example.freegame.data.api.RetrofitInstance.api
import com.example.freegame.data.dto.ListGameDto
import com.example.freegame.data.dto.ListGameItemDto
import com.example.freegame.domain.GameListRepository
import com.example.freegame.domain.model.ListGame

class GameListRepositoryImpl : GameListRepository {

    private val mapper = GameMapper()
    override suspend fun getListGame(): ListGame {
        TODO("Not yet implemented")
    }

}