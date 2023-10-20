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
            CardItem("Emma Johnson\nBiology", R.drawable.scienceone),
            CardItem("Mark Tahimik\nChemistry", R.drawable.sciencetwo),
            CardItem("Ava Wilson\nPhysics", R.drawable.sciencethree),
            CardItem("Olivia Davis\nFluid Mechanics", R.drawable.sciencefour),
            CardItem("Carlos Carlos\nInorganic Chemisty", R.drawable.sciencefive),
            CardItem("Sofia Andersen\nAstronomy", R.drawable.sciencesix),
            CardItem("Isabella Martinez\nLife Science", R.drawable.scienceseven),
            CardItem("Mia Turner\nOrganic Chemistry", R.drawable.scienceeight),

            )

        val adapter = CardItemAdapter(cardItems)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2) // 2 columns grid

        return view
    }
}
