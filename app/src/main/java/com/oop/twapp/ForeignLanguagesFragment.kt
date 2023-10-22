package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oop.twapp.databinding.FragmentForeignLanguagesBinding
import com.oop.twapp.databinding.FragmentHomeBinding

class ForeignLanguagesFragment : Fragment() {

    private lateinit var binding: FragmentForeignLanguagesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentForeignLanguagesBinding.inflate(inflater, container, false)
        val recyclerView: RecyclerView = binding.root.findViewById(R.id.recyclerView)

        val cardItems = listOf(
            CardItem(17,"Emily Parker\nLinguistics", R.drawable.lone),
            CardItem(18,"Ms. Emily Chen\nLanguage Learning and Teaching", R.drawable.ltwo),
            CardItem(19,"Sarah Anderson\nTranslation and Interpretation", R.drawable.lthree),
            CardItem(20,"David Mitchell\nCultural Studies", R.drawable.lfour),
            CardItem(21,"Michael Scott\nLiterature", R.drawable.lfive),
            CardItem(22,"Fredrick Sons\nDialectology", R.drawable.lsix),
            CardItem(23,"Lisa Chung\nLanguage History and Evolution", R.drawable.lseven),
            CardItem(24,"Olivia Theory\nApplied Linguistics", R.drawable.leight),

            )

        val adapter = CardItemAdapter(cardItems) { itemId ->
            when (itemId) {
                1 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, FTCard1Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                2 -> {
                    // Open the second fragment
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, FTCard2Fragment())
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
