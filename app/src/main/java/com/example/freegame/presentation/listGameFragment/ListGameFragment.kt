package com.example.freegame.presentation.listGameFragment

import android.os.Bundle
import android.text.Layout.Directions
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.RecyclerView
import com.example.freegame.databinding.FragmentListGameBinding

class ListGameFragment : Fragment() {

    private lateinit var binding: FragmentListGameBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: GameListAdapter
    private lateinit var viewModel: GameListViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListGameBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this)[GameListViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()

        viewModel.gameList.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }

        adapter.onGameClickListener = {
          findNavController().navigate(
              ListGameFragmentDirections.actionListGameFragmentToDetailFragment(it.id)
          )
        }
    }

    private fun initRecyclerView() {
        recyclerView = binding.recyclerView
        adapter = GameListAdapter()
        recyclerView.adapter = adapter
        val itemAnimator = binding.recyclerView.itemAnimator
        if (itemAnimator is DefaultItemAnimator) {
            itemAnimator.supportsChangeAnimations = false
        }
    }
}