package com.example.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.todolist.databinding.FragmentEditBinding
import database.ToDoDatabase



class EditFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val binding: FragmentEditBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_edit, container, false)

        val application = requireNotNull(this.activity).application

        val dataSource = ToDoDatabase.getInstance(application).toDoDatabaseDao

        binding.editViewModel = editViewModel

        return binding.root
    }
}

