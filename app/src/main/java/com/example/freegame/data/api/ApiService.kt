package com.example.freegame.data.api

import com.example.freegame.data.dto.ListGameDto
import retrofit2.http.GET

interface ApiService {

    @GET("/games")
    suspend fun getListGame(): ListGameDto
}