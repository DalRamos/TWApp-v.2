package com.oop.twapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oop.twapp.databinding.FragmentForeignLanguagesBinding

class ForeignLanguagesFragment : Fragment() {

    private lateinit var binding: FragmentForeignLanguagesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentForeignLanguagesBinding.inflate(inflater, container, false)
        val recyclerView: RecyclerView = binding.root.findViewById(R.id.recyclerView)

        val cardItems = listOf(
            CardItem(17,"Maria Rodriguez\nLinguistics", R.drawable.lone),
            CardItem(18,"Emily Chen\nLanguage and Teaching", R.drawable.ltwo),
            CardItem(19,"Emily Hall\nDialectology", R.drawable.lthree),
            CardItem(20,"Elizabeth King\nTranslation and Interpretation", R.drawable.lfour),
            CardItem(21,"Sofia Scott\nCulture Studies", R.drawable.lfive),
            CardItem(22,"Jonathan Miller\nLiterature", R.drawable.lsix),
            CardItem(23,"Benjamin Carter\nLanguage History and Evolution", R.drawable.lseven),
            CardItem(24,"Christopher Williams\nApplied Linguistics", R.drawable.leight),

            )

        val adapter = CardItemAdapter(cardItems) { itemId ->
            when (itemId) {
                17 -> {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Fl17Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                18 -> {
                    // Open the second fragment
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Fl18Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                19 -> {
                    // Open the second fragment
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Fl19Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                20 -> {
                    // Open the second fragment
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Fl20Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                21 -> {
                    // Open the second fragment
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Fl21Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                22 -> {
                    // Open the second fragment
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Fl22Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                23 -> {
                    // Open the second fragment
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Fl23Fragment())
                        .addToBackStack(null)
                        .commit()
                }
                24 -> {
                    // Open the second fragment
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, Fl24Fragment())
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
