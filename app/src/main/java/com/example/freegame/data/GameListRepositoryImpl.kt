package com.example.freegame.data

import com.example.freegame.data.api.RetrofitInstance.api
import com.example.freegame.domain.GameListRepository
import com.example.freegame.domain.model.ListGame

class GameListRepositoryImpl: GameListRepository {

    override suspend fun getListGame(): ListGame {
        val gameList = api.getListGame()
        return TODO()
    }
}