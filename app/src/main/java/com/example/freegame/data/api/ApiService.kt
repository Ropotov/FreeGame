package com.example.freegame.data.api

import com.example.freegame.data.dto.DetailGameItemDto
import com.example.freegame.data.dto.ListGameItemDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("games")
    suspend fun getListGame(): List<ListGameItemDto>

    @GET("game")
    suspend fun getGameToId(@Query("id") id: String): DetailGameItemDto
}