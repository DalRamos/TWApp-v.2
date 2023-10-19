package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentFTCard2Binding
import com.oop.twapp.databinding.FragmentFTCard3Binding


class FTCard3Fragment : Fragment() {

    lateinit var binding: FragmentFTCard3Binding
    lateinit var ft3back: ImageView
    private lateinit var appointmentButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFTCard3Binding.inflate(inflater, container, false)

        ft3back.setOnClickListener {
            findNavController().popBackStack()
        }

        appointmentButton.setOnClickListener {
            val bottomSheetFragment = MyBottomSheetFragment()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
        }

        return binding.root
    }
}