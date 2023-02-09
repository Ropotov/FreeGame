package com.example.freegame.data.dto

data class DetailGameItemDto(
    val description: String?,
    val developer: String?,
    val freetogame_profile_url: String?,
    val game_url: String?,
    val genre: String?,
    val id: Int?,
    val minimum_system_requirements: SystemRequirementsDto,
    val platform: String?,
    val publisher: String?,
    val release_date: String?,
    val screenshots: List<ScreenshotDto>,
    val short_description: String?,
    val status: String?,
    val thumbnail: String?,
    val title: String?
)

data class ScreenshotDto(
    val id: Int?,
    val image: String?
)

data class SystemRequirementsDto(
    val graphics: String?,
    val memory: String?,
    val os: String?,
    val processor: String?,
    val storage: String?
)