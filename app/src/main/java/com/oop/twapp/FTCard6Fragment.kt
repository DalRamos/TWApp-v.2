package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentFTCard6Binding

class FTCard6Fragment : Fragment() {

    lateinit var binding: FragmentFTCard6Binding
    lateinit var ft6back: ImageView
    private lateinit var appointmentButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFTCard6Binding.inflate(inflater)
        ft6back = binding.root.findViewById(R.id.ft6back)
        appointmentButton = binding.root.findViewById(R.id.appointmentButton)

        ft6back.setOnClickListener {
            findNavController().popBackStack()
        }

        appointmentButton.setOnClickListener {
            val bottomSheetFragment = MyBottomSheetFragment()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
        }

        return binding.root
    }
}