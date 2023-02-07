package com.example.freegame.domain.useCases

import com.example.freegame.data.GameListRepositoryImpl
import com.example.freegame.domain.model.ListGameItem

class GetListGamesUseCase {

    private val repository = GameListRepositoryImpl()

    suspend fun getListGame(): List<ListGameItem>{
        return repository.getListGame()
    }
}