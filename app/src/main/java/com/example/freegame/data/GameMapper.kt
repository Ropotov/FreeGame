package com.example.freegame.data

import com.example.freegame.data.dto.DetailGameItemDto
import com.example.freegame.data.dto.ListGameItemDto
import com.example.freegame.data.dto.ScreenshotDto
import com.example.freegame.data.dto.SystemRequirementsDto
import com.example.freegame.domain.model.DetailGameItem
import com.example.freegame.domain.model.ListGameItem
import com.example.freegame.domain.model.Screenshot
import com.example.freegame.domain.model.SystemRequirements

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

    fun mapListGameItemDtoToListGameItem(listGameDto: List<ListGameItemDto>): List<ListGameItem> {
        val listGameItem = mutableListOf<ListGameItem>()
        for (i in listGameDto) {
            val newItem = mapGameItemDtoToGameItem(i)
            listGameItem.add(newItem)
        }
        return listGameItem
    }

    private fun mapScreenshotDtoToScreenshot(screenshotDto: ScreenshotDto) = Screenshot(
        id = screenshotDto.id ?: EMPTY_NUMBER,
        image = screenshotDto.image ?: EMPTY_STRING
    )

    private fun mapSystemRequirements(systemRequirementsDto: SystemRequirementsDto) =
        SystemRequirements(
            graphics = systemRequirementsDto.graphics ?: EMPTY_STRING,
            memory = systemRequirementsDto.memory ?: EMPTY_STRING,
            os = systemRequirementsDto.os ?: EMPTY_STRING,
            processor = systemRequirementsDto.processor ?: EMPTY_STRING,
            storage = systemRequirementsDto.storage ?: EMPTY_STRING
        )

    private fun mapScreenshotList(listScreenshotDto: List<ScreenshotDto>): List<Screenshot> {
        val listScreenshot = mutableListOf<Screenshot>()
        for (i in listScreenshotDto) {
            val newItem = mapScreenshotDtoToScreenshot(i)
            listScreenshot.add(newItem)
        }
        return listScreenshot
    }

    fun mapDetailGameItemDtoToDetailGameItem(detailGameItemDto: DetailGameItemDto) =
        DetailGameItem(
            description = detailGameItemDto.description ?: EMPTY_STRING,
            developer = detailGameItemDto.developer ?: EMPTY_STRING,
            freetogame_profile_url = detailGameItemDto.freetogame_profile_url ?: EMPTY_STRING,
            game_url = detailGameItemDto.game_url ?: EMPTY_STRING,
            genre = detailGameItemDto.genre ?: EMPTY_STRING,
            id = detailGameItemDto.id ?: EMPTY_NUMBER,
            minimum_system_requirements = mapSystemRequirements(detailGameItemDto.minimum_system_requirements),
            platform = detailGameItemDto.platform ?: EMPTY_STRING,
            publisher = detailGameItemDto.publisher ?: EMPTY_STRING,
            release_date = detailGameItemDto.release_date ?: EMPTY_STRING,
            screenshots = mapScreenshotList(detailGameItemDto.screenshots),
            short_description = detailGameItemDto.short_description ?: EMPTY_STRING,
            status = detailGameItemDto.status ?: EMPTY_STRING,
            thumbnail = detailGameItemDto.thumbnail ?: EMPTY_STRING,
            title = detailGameItemDto.title ?: EMPTY_STRING
        )

    companion object {
        private const val EMPTY_STRING = ""
        private const val EMPTY_NUMBER = 0
    }
}