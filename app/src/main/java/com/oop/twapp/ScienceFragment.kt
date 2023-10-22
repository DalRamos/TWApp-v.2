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

        val cardItems = listOf(
            CardItem(41, "Emma Johnson\nBiology", R.drawable.scienceone),
            CardItem(42, "Mark Tahimik\nChemistry", R.drawable.sciencetwo),
            CardItem(43, "Ava Wilson\nPhysics", R.drawable.sciencethree),
            CardItem(44, "Olivia Davis\nFluid Mechanics", R.drawable.sciencefour),
            CardItem(45, "Carlos Carlos\nInorganic Chemisty", R.drawable.sciencefive),
            CardItem(46, "Sofia Andersen\nAstronomy", R.drawable.sciencesix),
            CardItem(47, "Isabella Martinez\nLife Science", R.drawable.scienceseven),
            CardItem(48, "Mia Turner\nOrganic Chemistry", R.drawable.scienceeight),

            )

        val adapter = CardItemAdapter(cardItems) { itemId ->
            when (itemId) {
                41 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Science41Fragment())
                        .addToBackStack(null)
                        .commit()
                }

                42 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Science42Fragment())
                        .addToBackStack(null)
                        .commit()
                }

                43 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Science43Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                44 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Science44Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                45 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Science45Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                46 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Science46Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                47 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Science47Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                48 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Science48Fragment())
                        .addToBackStack(null)
                        .commit()
                }
            }
        }

            recyclerView.adapter = adapter
            recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)

            return view
        }

}
