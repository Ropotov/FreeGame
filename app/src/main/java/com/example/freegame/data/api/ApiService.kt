package com.example.freegame.data.api

import com.example.freegame.data.dto.ListGameDto
import com.example.freegame.data.dto.ListGameItemDto
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("games")
    suspend fun getListGame(): List<ListGameItemDto>
}