package com.example.freegame.domain.model

data class DetailGameItem(
    val description: String,
    val developer: String,
    val freetogame_profile_url: String,
    val game_url: String,
    val genre: String,
    val id: Int,
    val minimum_system_requirements: SystemRequirements,
    val platform: String,
    val publisher: String,
    val release_date: String,
    val screenshots: List<Screenshot>,
    val short_description: String,
    val status: String,
    val thumbnail: String,
    val title: String
)

data class Screenshot(
    val id: Int,
    val image: String
)

data class SystemRequirements(
    val graphics: String,
    val memory: String,
    val os: String,
    val processor: String,
    val storage: String
)