package com.example.freegame.presentation.detailFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.freegame.domain.model.DetailGameItem
import com.example.freegame.domain.useCases.GetGameDetailItemUseCase
import kotlinx.coroutines.launch

class DetailGameViewModel : ViewModel() {

    private val useCase = GetGameDetailItemUseCase()

    private val _gameDetailItem = MutableLiveData<DetailGameItem>()
    val gameDetailItem: LiveData<DetailGameItem> = _gameDetailItem

    fun getGameDetailItem(id: Int){
        viewModelScope.launch {
            _gameDetailItem.value = useCase.getGameDetailItem(id)
        }
    }
}