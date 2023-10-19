package com.oop.twapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.ismaeldivita.chipnavigation.ChipNavigationBar

class TabFragment : Fragment() {

    private lateinit var tabToHomeButton: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_tab, container, false)

        val viewPager: ViewPager = rootView.findViewById(R.id.viewPager)
        val tabLayout: TabLayout = rootView.findViewById(R.id.tabLayout)

        val adapter = TabAdapter(childFragmentManager)
        adapter.addFragment(MathematicsFragment(), "Mathematics")
        adapter.addFragment(ScienceFragment(), "Science")
        adapter.addFragment(MusicArtsFragment(), "Music and Arts")
        adapter.addFragment(ForeignLanguagesFragment(), "Foreign Languages")
        adapter.addFragment(HistoryFragment(), "History and Social Studies")
        adapter.addFragment(ComputerFragment(), "Computer Science and Programming")

        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
        Log.i("Test","Clicked")

        val tabIndex = arguments?.getInt("tabIndex", 0) ?: 0
        viewPager.currentItem = tabIndex

        val tabToHomeButton = rootView.findViewById<ImageView>(R.id.tabToHomeButton)

        tabToHomeButton.setOnClickListener {
            findNavController().navigate(R.id.action_tabFragment_to_homeFragment)
            Log.i("Test","Clicked2")
//            val bottomNav = activity?.findViewById<ChipNavigationBar>(R.id.bottom_nav_bar)
//            bottomNav?.setItemSelected(R.id.nav_home)
//            bottomNav?.visibility = View.VISIBLE
        }

        return rootView
    }
}
