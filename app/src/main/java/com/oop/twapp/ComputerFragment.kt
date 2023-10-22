package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oop.twapp.databinding.FragmentComputerBinding
import com.oop.twapp.databinding.FragmentHomeBinding

class ComputerFragment : Fragment() {

    private lateinit var binding: FragmentComputerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentComputerBinding.inflate(inflater, container, false)
        val recyclerView: RecyclerView = binding.root.findViewById(R.id.recyclerView)

        val cardItems = listOf(
            CardItem(9,"Miguel Silva\nSoftware Development", R.drawable.cone),
            CardItem(10,"Pedro Santos\nArtificial Intelligence", R.drawable.ctwo),
            CardItem(11,"Ayesha Gonzales\nData Science", R.drawable.cthree),
            CardItem(12,"Lorna Cruz\nCyber Security", R.drawable.cfour),
            CardItem(13,"Angela Reyes\nDatabase Management", R.drawable.cfive),
            CardItem(14,"João Costa\nWeb Development", R.drawable.csix),
            CardItem(15,"Ricardo Pereira\nComputer Graphics", R.drawable.cseven),
            CardItem(16,"Luis Oliveira\nNetwork Admin", R.drawable.ceight),

            )

        val adapter = CardItemAdapter(cardItems) { itemId ->
            when (itemId) {
                9 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Com9Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                10 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Com10Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                11 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Com11Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                12 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Com12Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                13 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Com13Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                14 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Com14Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                15 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Com15Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                16 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Com16Fragment())
                        .addToBackStack(null)
                        .commit()
                }
            }
        }

        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2) // 2 columns grid

        return binding.root
    }
}
