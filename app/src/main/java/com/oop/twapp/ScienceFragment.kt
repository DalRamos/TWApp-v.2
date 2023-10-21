package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ScienceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_science, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)

        // Create a list of CardItem objects with text and image resources
        val cardItems = listOf(
            CardItem(41,"Emma Johnson\nBiology", R.drawable.scienceone),
            CardItem(42,"Mark Tahimik\nChemistry", R.drawable.sciencetwo),
            CardItem(43,"Ava Wilson\nPhysics", R.drawable.sciencethree),
            CardItem(44,"Olivia Davis\nFluid Mechanics", R.drawable.sciencefour),
            CardItem(45,"Carlos Carlos\nInorganic Chemisty", R.drawable.sciencefive),
            CardItem(46,"Sofia Andersen\nAstronomy", R.drawable.sciencesix),
            CardItem(47,"Isabella Martinez\nLife Science", R.drawable.scienceseven),
            CardItem(48,"Mia Turner\nOrganic Chemistry", R.drawable.scienceeight),

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

        return view
    }
}
