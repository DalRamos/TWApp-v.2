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
            CardItem("Emily Parker\nSoftware Development", R.drawable.cone),
            CardItem("William Turner\nArtificial Intelligence", R.drawable.ctwo),
            CardItem("Sarah Anderson\nData Science", R.drawable.cthree),
            CardItem("David Mitchell\nCybersecurity", R.drawable.cfour),
            CardItem("Michael Scott\nDatabase Management", R.drawable.cfive),
            CardItem("Fredrick Sons\nWeb Development", R.drawable.csix),
            CardItem("Lisa Chung\nComputer Graphics", R.drawable.cseven),
            CardItem("Olivia Theory\nNetwork Admin", R.drawable.ceight),

            )

        val adapter = CardItemAdapter(cardItems)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)

        return binding.root
    }
}
