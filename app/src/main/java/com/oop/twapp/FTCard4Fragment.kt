package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentFTCard3Binding
import com.oop.twapp.databinding.FragmentFTCard4Binding


class FTCard4Fragment : Fragment() {

    lateinit var binding: FragmentFTCard4Binding
    lateinit var ft4back: ImageView
    private lateinit var appointmentButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFTCard4Binding.inflate(inflater, container, false)

        ft4back.setOnClickListener {
            findNavController().popBackStack()
        }

        appointmentButton.setOnClickListener {
            val bottomSheetFragment = MyBottomSheetFragment()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
        }

        return binding.root
    }
}