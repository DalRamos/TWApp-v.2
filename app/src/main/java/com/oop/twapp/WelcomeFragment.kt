package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.Navigation

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.welcome, container, false)

        val next = view.findViewById<ConstraintLayout>(R.id.next)

        next.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_welcomeFragment_to_loginFragment)
        }

        return view
    }
}