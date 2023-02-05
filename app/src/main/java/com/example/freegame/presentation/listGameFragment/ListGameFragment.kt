package com.example.freegame.presentation.listGameFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.freegame.databinding.FragmentListGameBinding

class ListGameFragment : Fragment() {

    private lateinit var binding: FragmentListGameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListGameBinding.inflate(inflater, container, false)
        return binding.root
    }
}