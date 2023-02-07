package com.example.freegame.presentation.listGameFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.freegame.data.api.RetrofitInstance
import com.example.freegame.data.dto.ListGameDto
import com.example.freegame.data.dto.ListGameItemDto
import com.example.freegame.domain.model.ListGame
import com.example.freegame.domain.useCases.GetListGamesUseCase
import kotlinx.coroutines.launch

class GameListViewModel : ViewModel() {

    private val useCase = GetListGamesUseCase()

    private val _gameList = MutableLiveData<List<ListGameItemDto>>()
    val gameList: LiveData<List<ListGameItemDto>> = _gameList

    private fun gelListGame() {
        viewModelScope.launch {
            _gameList.value = RetrofitInstance.api.getListGame()
        }
    }

    init {
        gelListGame()
    }
}