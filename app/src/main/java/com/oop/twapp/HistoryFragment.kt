package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oop.twapp.databinding.FragmentHistoryBinding
import com.oop.twapp.databinding.FragmentHomeBinding

class HistoryFragment : Fragment() {

    private lateinit var binding: FragmentHistoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistoryBinding.inflate(inflater, container, false)
        val recyclerView: RecyclerView = binding.root.findViewById(R.id.recyclerView)

        // Create a list of CardItem objects with text and image resources
        val cardItems = listOf(
            CardItem("Emily Parker\nPolitical History", R.drawable.hone),
            CardItem("William Turner\nEconomic History", R.drawable.htwo),
            CardItem("Sarah Anderson\nCultural History", R.drawable.hthree),
            CardItem("David Mitchell\nEnvironmental History", R.drawable.hfour),
            CardItem("Michael Scott\nGeography ", R.drawable.hfive),
            CardItem("Fredrick Sons\nSociology", R.drawable.hsix),
            CardItem("Lisa Chung\nMilitary History", R.drawable.hseven),
            CardItem("Olivia Theory\nCivics and Government", R.drawable.height),

            )

        val adapter = CardItemAdapter(cardItems)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2) // 2 columns grid

        return binding.root
    }
}
