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
            CardItem("Emily Parker\nAlgebra", R.drawable.mathfirst),
            CardItem("William Turner\nGeometry", R.drawable.mathsecond),
            CardItem("Sarah Anderson\nStatistics", R.drawable.maththird),
            CardItem("David Mitchell\nProbability", R.drawable.mathfourth),
            CardItem("Michael Scott\nLinear Algebra", R.drawable.mathfifth),
            CardItem("Fredrick Sons\nTrigonometry", R.drawable.mathsixth),
            CardItem("Lisa Chung\nCalculus", R.drawable.mathseventh),
            CardItem("Olivia Theory\nNumber Theory", R.drawable.matheight),

            )

        val adapter = CardItemAdapter(cardItems)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)

        return binding.root
    }
}
