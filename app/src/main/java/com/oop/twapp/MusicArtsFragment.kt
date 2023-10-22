package com.oop.twapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oop.twapp.databinding.FragmentMusicArtsBinding

class MusicArtsFragment : Fragment() {

    private lateinit var binding: FragmentMusicArtsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicArtsBinding.inflate(inflater, container, false)
        val recyclerView: RecyclerView = binding.root.findViewById(R.id.recyclerView)

        val cardItems = listOf(
            CardItem(33,"Sophia Mitchell\nVisual Arts", R.drawable.artone),
            CardItem(34,"Amber Turner\nDesign Architecture ", R.drawable.arttwo),
            CardItem(35,"Maria Santos\nArt History", R.drawable.artthree),
            CardItem(36,"Angelica Cruz\nDance", R.drawable.artfour),
            CardItem(37,"Biance Santos\nFilm and Cinema", R.drawable.artfive),
            CardItem(38,"Andrea Ramirez\nLiterary Arts", R.drawable.artsix),
            CardItem(39,"Julia Hernandez\nMusic Theory", R.drawable.artseven),
            CardItem(40,"Elena Flores\nPerforming Arts", R.drawable.arteight),

            )

        val adapter = CardItemAdapter(cardItems) { itemId ->
            when (itemId) {
                33 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Ma33Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                34 -> {
                    // Open the second fragment
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Ma34Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                35 -> {
                    // Open the second fragment
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Ma35Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                36 -> {
                    // Open the second fragment
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Ma36Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                37 -> {
                    // Open the second fragment
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Ma37Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                38 -> {
                    // Open the second fragment
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Ma38Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                39 -> {
                    // Open the second fragment
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Ma39Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                40 -> {
                    // Open the second fragment
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Ma40Fragment())
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
