package com.oop.twapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.ismaeldivita.chipnavigation.ChipNavigationBar


class BottomNavFragment : Fragment() {
    // By Default
    private val fragment = HomeFragment()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_bottom_nav, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        openMainFragment()
        (activity as AppCompatActivity).supportActionBar?.hide()


        val menu_bottom = view.findViewById<ChipNavigationBar>(R.id.bottom_nav_bar)
        menu_bottom.setItemSelected(R.id.nav_home)

        menu_bottom.setOnItemSelectedListener {
            when (it) {
                R.id.nav_home -> {
                    openMainFragment()
                    Log.i("test", "BotNavigation")
                }
                R.id.nav_tutor -> {
                    val favoriteFragment = TabFragment()
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.frag_container_nav, favoriteFragment).commit()
                    Log.i("test", "BotNavigation2")

                }
                R.id.nav_reservation -> {
                    val profileFragment = ReservationFragment()
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.frag_container_nav, profileFragment).commit()
                    Log.i("test", "BotNavigation3")

                }
                R.id.nav_settings -> {
                    val profileFragment = SettingFragment()
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.frag_container_nav, profileFragment).commit()
                    Log.i("test", "BotNavigation4")

                }
            }
        }
    }

    private fun openMainFragment() {
        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.frag_container_nav, fragment)
        transaction.commit()
    }
}
