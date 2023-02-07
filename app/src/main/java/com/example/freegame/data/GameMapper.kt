package com.example.freegame.data

import com.example.freegame.data.dto.ListGameDto
import com.example.freegame.data.dto.ListGameItemDto
import com.example.freegame.domain.model.ListGame
import com.example.freegame.domain.model.ListGameItem

class GameMapper {

    private fun mapGameItemDtoToGameItem(
        listGameItemDto: ListGameItemDto
    ) = ListGameItem(
        developer = listGameItemDto.developer ?: EMPTY_STRING,
        game_url = listGameItemDto.game_url ?: EMPTY_STRING,
        genre = listGameItemDto.genre ?: EMPTY_STRING,
        id = listGameItemDto.id ?: EMPTY_NUMBER,
        platform = listGameItemDto.platform ?: EMPTY_STRING,
        publisher = listGameItemDto.publisher ?: EMPTY_STRING,
        release_date = listGameItemDto.release_date ?: EMPTY_STRING,
        short_description = listGameItemDto.short_description ?: EMPTY_STRING,
        thumbnail = listGameItemDto.thumbnail ?: EMPTY_STRING,
        title = listGameItemDto.title ?: EMPTY_STRING
    )

    private fun mapListGameItemDtoToListGameItem(
        listGameDto: List<ListGameItemDto>
    ) = listGameDto.map {
        mapGameItemDtoToGameItem(it)
    }

    fun mapListGameDtoToListGame(listGameDto: ListGameDto) = ListGame(
        listGame = mapListGameItemDtoToListGameItem(listGameDto.listGame)
    )

    companion object {
        private const val EMPTY_STRING = ""
        private const val EMPTY_NUMBER = 0
    }
}