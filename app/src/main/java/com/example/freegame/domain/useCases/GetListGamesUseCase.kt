package com.example.freegame.domain.useCases

import com.example.freegame.data.GameListRepositoryImpl
import com.example.freegame.domain.model.ListGame

class GetListGamesUseCase {

    private val repository = GameListRepositoryImpl()

    suspend fun getListGame(): ListGame{
        return repository.getListGame()
    }
}