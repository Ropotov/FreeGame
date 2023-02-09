package com.example.freegame.presentation.detailFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.freegame.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private val args by navArgs<DetailFragmentArgs>()
    private lateinit var binding: FragmentDetailBinding
    private lateinit var viewModel: DetailGameViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this)[DetailGameViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getGameDetailItem(args.id)
        viewModel.gameDetailItem.observe(viewLifecycleOwner) {
            with(binding) {
                tvDescription.text = it.description
                tvDetailDeveloper.text = it.developer
                tvDetailGameName.text = it.title
                tvDetailRealiseDate.text = it.release_date
                Glide.with(ivDetailPoster).load(it.thumbnail).into(ivDetailPoster)
            }
        }
    }
}