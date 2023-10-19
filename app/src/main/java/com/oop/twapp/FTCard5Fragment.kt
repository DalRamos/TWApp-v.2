package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentFTCard4Binding
import com.oop.twapp.databinding.FragmentFTCard5Binding

class FTCard5Fragment : Fragment() {

    lateinit var binding: FragmentFTCard5Binding
    lateinit var ft5back: ImageView
    private lateinit var appointmentButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFTCard5Binding.inflate(inflater, container, false)
        ft5back = binding.root.findViewById(R.id.ft5back)
        appointmentButton = binding.root.findViewById(R.id.appointmentButton)

        ft5back.setOnClickListener {
            findNavController().popBackStack()
        }

        appointmentButton.setOnClickListener {
            val bottomSheetFragment = MyBottomSheetFragment()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
        }

        return binding.root
    }
}