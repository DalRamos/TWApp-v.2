package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MusicArtsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_music_arts, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)

        // Create a list of CardItem objects with text and image resources
        val cardItems = listOf(
            CardItem(33,"Emily Parker\nVisual Arts", R.drawable.artone),
            CardItem(34,"William Turner\nPerforming Arts", R.drawable.arttwo),
            CardItem(35,"Sarah Anderson\nMusic Theory and Composition:", R.drawable.artthree),
            CardItem(36,"David Mitchell\nArt History", R.drawable.artfour),
            CardItem(37,"Michael Scott\nDance ", R.drawable.artfive),
            CardItem(38,"Fredrick Sons\nFilm and Cinema", R.drawable.artsix),
            CardItem(39,"Lisa Chung\nLiterary Arts", R.drawable.artseven),
            CardItem(40,"Olivia Theory\nDesign and Architecture", R.drawable.arteight),

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
