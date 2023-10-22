package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MathematicsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mathematics, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)


        val cardItems = listOf(
            CardItem(1, "Emily Parker\nAlgebra", R.drawable.mathfirst),
            CardItem(2, "William Turner\nGeometry", R.drawable.mathsecond),
            CardItem(3, "Sarah Anderson\nStatistics", R.drawable.maththird),
            CardItem(4, "David Mitchell\nProbability", R.drawable.mathfourth),
            CardItem(5, "Michael Scott\nLinear Algebra", R.drawable.mathfifth),
            CardItem(6, "Fredrick Sons\nTrigonometry", R.drawable.mathsixth),
            CardItem(7, "Lisa Chung\nCalculus", R.drawable.mathseventh),
            CardItem(8, "Olivia Theory\nNumber Theory", R.drawable.matheight)
        )

        val adapter = CardItemAdapter(cardItems) { itemId ->
            when (itemId) {
                1 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Math1Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                2 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Math2Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                3 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Math3Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                4 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Math4Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                5 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Math5Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                6 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Math6Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                7 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Math7Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                8 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Math8Fragment())
                        .addToBackStack(null)
                        .commit()
                }
            }
        }

        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2) // 2 columns grid

        return view
    }
}
