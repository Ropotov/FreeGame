package com.example.freegame.domain.useCases

import com.example.freegame.data.GameListRepositoryImpl
import com.example.freegame.domain.model.DetailGameItem

class GetGameDetailItemUseCase {

    private val repository = GameListRepositoryImpl()

    suspend fun getGameDetailItem(id: Int): DetailGameItem {
        return repository.getGameToId(id)
    }
}