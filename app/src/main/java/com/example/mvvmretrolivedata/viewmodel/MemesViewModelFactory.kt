package com.example.mvvmretrolivedata.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmretrolivedata.repository.MemesRepo

class MemesViewModelFactory(private val memesRepo: MemesRepo): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MemesViewModel(memesRepo) as T
    }
}