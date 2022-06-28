package com.example.todolist

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.todolist.databinding.FragmentEditBinding
import org.w3c.dom.Text


class EditFragment : Fragment() {
    private lateinit var viewModel: EditViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentEditBinding>(
            inflater,
            R.layout.fragment_edit, container, false)

        Log.i("EditViewModel", "Called EditViewModel.get")
        viewModel = ViewModelProvider(this).get(EditViewModel::class.java)

        return binding.root
    }
}

