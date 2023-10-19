package com.oop.twapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oop.twapp.databinding.FragmentHomeBinding
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.ismaeldivita.chipnavigation.ChipNavigationBar
import com.oop.twapp.TabFragmentDirections.Companion.actionTabFragmentToHomeFragment

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewCourses: TextView
    private lateinit var seeAllFT: TextView
    private lateinit var toMathematics: ConstraintLayout
    private lateinit var toScience: ConstraintLayout
    private lateinit var toMusic: ConstraintLayout
    private lateinit var toLanguages: ConstraintLayout
    private lateinit var toSocialStudies: ConstraintLayout
    private lateinit var toComputer: ConstraintLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        toMathematics = binding.root.findViewById(R.id.toMathematics)
        toScience = binding.root.findViewById(R.id.toScience)
        toMusic = binding.root.findViewById(R.id.toMusic)
        toLanguages = binding.root.findViewById(R.id.toLanguages)
        toSocialStudies = binding.root.findViewById(R.id.toSocialStudies)
        toComputer = binding.root.findViewById(R.id.toComputer)

        toMathematics.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToTabFragment(tabIndex = 0)
            findNavController().navigate(action)
            Log.i("Test","Mathematics")
        }

        toScience.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToTabFragment(tabIndex = 1)
            findNavController().navigate(action)
        }

        toMusic.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToTabFragment(2)
            findNavController().navigate(action)
        }

        toLanguages.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToTabFragment(3)
            findNavController().navigate(action)
        }

        toSocialStudies.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToTabFragment(4)
            findNavController().navigate(action)
        }

        toComputer.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToTabFragment(5)
            findNavController().navigate(action)
        }

        val recyclerView: RecyclerView = binding.recyclerView

        val cardItems = ArrayList<FTCardItem>()
        cardItems.add(FTCardItem("ftCard1", R.drawable.tabpicone, "Dr. Ronald Wayne\nArithmetic"))
        cardItems.add(FTCardItem("ftCard2", R.drawable.tabpictwo, "Dr. Ronald Wayne\nArithmetic"))
        cardItems.add(FTCardItem("ftCard3", R.drawable.tabpicthree, "Dr. Ronald Wayne\nArithmetic"))
        cardItems.add(FTCardItem("ftCard4", R.drawable.tabpicfour, "Dr. Ronald Wayne\nArithmetic"))
        cardItems.add(FTCardItem("ftCard5", R.drawable.tabpicfive, "Dr. Ronald Wayne\nArithmetic"))
        cardItems.add(FTCardItem("ftCard6", R.drawable.tabpic, "Dr. Ronald Wayne\nArithmetic"))

        val adapter = FTAdapter(cardItems) { item ->
            val action = when (item.id) {
                "ftCard1" -> HomeFragmentDirections.actionHomeFragmentToFTCard1Fragment()
                "ftCard2" -> HomeFragmentDirections.actionHomeFragmentToFTCard1Fragment()
                else -> null
            }

            action?.let {
                findNavController().navigate(it)
            }
        }


        recyclerView.layoutManager = GridLayoutManager(context, 2)
        recyclerView.adapter = adapter

        viewCourses = binding.root.findViewById(R.id.viewCourses)
        seeAllFT = binding.root.findViewById(R.id.seeAllFT)


        viewCourses.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToTabFragment(0)
            findNavController().navigate(action)
//            val bottomNav = activity?.findViewById<ChipNavigationBar>(R.id.bottom_nav_bar)
//            bottomNav?.visibility = View.GONE
//            bottomNav?.setItemSelected(R.id.nav_tutor)
        }

        seeAllFT.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToTabFragment(0)
            findNavController().navigate(action)
//            val bottomNav = activity?.findViewById<ChipNavigationBar>(R.id.bottom_nav_bar)
//            bottomNav?.visibility = View.GONE
//            bottomNav?.setItemSelected(R.id.nav_tutor)
        }

        return binding.root
    }

}

