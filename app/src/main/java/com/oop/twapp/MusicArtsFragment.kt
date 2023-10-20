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
            CardItem("Emily Parker\nVisual Arts", R.drawable.artone),
            CardItem("William Turner\nPerforming Arts", R.drawable.arttwo),
            CardItem("Sarah Anderson\nMusic Theory and Composition:", R.drawable.artthree),
            CardItem("David Mitchell\nArt History", R.drawable.artfour),
            CardItem("Michael Scott\nDance ", R.drawable.artfive),
            CardItem("Fredrick Sons\nFilm and Cinema", R.drawable.artsix),
            CardItem("Lisa Chung\nLiterary Arts", R.drawable.artseven),
            CardItem("Olivia Theory\nDesign and Architecture", R.drawable.arteight),

            )

        val adapter = CardItemAdapter(cardItems)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2) // 2 columns grid

        return view
    }
}
