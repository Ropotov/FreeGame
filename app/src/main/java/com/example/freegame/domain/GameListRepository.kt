package com.example.freegame.domain

import com.example.freegame.domain.model.ListGameItem

interface GameListRepository {

    suspend fun getListGame(): List<ListGameItem>
}