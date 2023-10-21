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
            CardItem(25,"Emily Parker\nPolitical History", R.drawable.hone),
            CardItem(26,"William Turner\nEconomic History", R.drawable.htwo),
            CardItem(27,"Sarah Anderson\nCultural History", R.drawable.hthree),
            CardItem(28,"David Mitchell\nEnvironmental History", R.drawable.hfour),
            CardItem(29,"Michael Scott\nGeography ", R.drawable.hfive),
            CardItem(30,"Fredrick Sons\nSociology", R.drawable.hsix),
            CardItem(31,"Lisa Chung\nMilitary History", R.drawable.hseven),
            CardItem(32,"Olivia Theory\nCivics and Government", R.drawable.height),

            )

        val adapter = CardItemAdapter(cardItems) { itemId ->
            when (itemId) {
                1 -> {
                    // Open the first fragment
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, FTCard1Fragment()) // Replace with the desired fragment
                        .addToBackStack(null)
                        .commit()
                }
                2 -> {
                    // Open the second fragment
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, FTCard2Fragment()) // Replace with the desired fragment
                        .addToBackStack(null)
                        .commit()
                }
                // Add cases for other card items
            }
        }

        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2) // 2 columns grid

        return binding.root
    }
}
