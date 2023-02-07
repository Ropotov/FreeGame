package com.example.freegame.domain.useCases

import com.example.freegame.data.GameListRepositoryImpl

class GetListGamesUseCase {

    private val repository = GameListRepositoryImpl()

    suspend fun getListGame(){
        repository.getListGame()
    }
}