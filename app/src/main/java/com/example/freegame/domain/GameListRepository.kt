package com.example.freegame.domain

import com.example.freegame.domain.model.ListGame

interface GameListRepository {

    suspend fun getListGame(): ListGame
}