package com.example.todolist

import android.util.Log
import androidx.lifecycle.ViewModel

class EditViewModel  : ViewModel() {
    init {
        Log.i("EditViewModel", "EditViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("EditViewModel", "EditViewModel created!")
    }
}