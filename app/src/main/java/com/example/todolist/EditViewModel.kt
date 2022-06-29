package com.example.todolist

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import database.ToDoDatabaseDao

class EditViewModel(
    val database: ToDoDatabaseDao,
    application: Application) : AndroidViewModel(application) {

    init {
        Log.i("EditViewModel", "EditViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("EditViewModel", "EditViewModel created!")
    }
}