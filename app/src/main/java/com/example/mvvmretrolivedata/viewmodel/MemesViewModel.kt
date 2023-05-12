package com.example.mvvmretrolivedata.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmretrolivedata.model.Jokes
import com.example.mvvmretrolivedata.repository.MemesRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MemesViewModel(private val memesRepo: MemesRepo): ViewModel() {

    init {
        viewModelScope.launch (Dispatchers.IO) {
            memesRepo.getMemes()
        }

    }
    val memes : LiveData<Jokes>
        get() = memesRepo.memes
}