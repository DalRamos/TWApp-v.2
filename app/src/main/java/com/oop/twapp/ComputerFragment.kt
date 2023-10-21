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
            CardItem(9,"Emily Parker\nSoftware Development", R.drawable.cone),
            CardItem(10,"William Turner\nArtificial Intelligence", R.drawable.ctwo),
            CardItem(11,"Sarah Anderson\nData Science", R.drawable.cthree),
            CardItem(12,"David Mitchell\nCybersecurity", R.drawable.cfour),
            CardItem(13,"Michael Scott\nDatabase Management", R.drawable.cfive),
            CardItem(14,"Fredrick Sons\nWeb Development", R.drawable.csix),
            CardItem(15,"Lisa Chung\nComputer Graphics", R.drawable.cseven),
            CardItem(16,"Olivia Theory\nNetwork Admin", R.drawable.ceight),

            )

        val adapter = CardItemAdapter(cardItems) { itemId ->
            when (itemId) {
                9 -> {
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
