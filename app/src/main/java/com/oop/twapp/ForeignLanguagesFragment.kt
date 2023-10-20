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
            CardItem("Emily Parker\nLinguistics", R.drawable.lone),
            CardItem("William Turner\nLanguage Learning and Teaching", R.drawable.ltwo),
            CardItem("Sarah Anderson\nTranslation and Interpretation", R.drawable.lthree),
            CardItem("David Mitchell\nCultural Studies", R.drawable.lfour),
            CardItem("Michael Scott\nLiterature", R.drawable.lfive),
            CardItem("Fredrick Sons\nDialectology", R.drawable.lsix),
            CardItem("Lisa Chung\nLanguage History and Evolution", R.drawable.lseven),
            CardItem("Olivia Theory\nApplied Linguistics", R.drawable.leight),

            )

        val adapter = CardItemAdapter(cardItems)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2) // 2 columns grid

        return binding.root
    }
}
