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

        val cardItems = listOf(
            CardItem(25,"Benjamin Smith\nPolitical History", R.drawable.hone),
            CardItem(26,"William Anderson\nEconomic History", R.drawable.htwo),
            CardItem(27,"Michael Bennett\nCultural History", R.drawable.hthree),
            CardItem(28,"David Clark\nEnvironmental History", R.drawable.hfour),
            CardItem(29,"John Mitchell\nGeography ", R.drawable.hfive),
            CardItem(30,"Robert Wilson\nSociology", R.drawable.hsix),
            CardItem(31,"William Taylor\nMilitary History", R.drawable.hseven),
            CardItem(32,"Christopher White\nCivics and Government", R.drawable.height),

            )

        val adapter = CardItemAdapter(cardItems) { itemId ->
            when (itemId) {
                25 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, History25Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                26 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, History26Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                27 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, History27Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                28 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, History28Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                29 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, History29Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                30 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, History30Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                31 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, History31Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                32 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, History32Fragment())
                        .addToBackStack(null)
                        .commit()
                }
            }
        }

        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)

        return binding.root
    }
}
