package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentComputerBinding
import com.oop.twapp.databinding.FragmentFTCard2Binding

class FTCard2Fragment : Fragment() {

    lateinit var binding: FragmentFTCard2Binding
    lateinit var ft2back: ImageView
    private lateinit var appointmentButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFTCard2Binding.inflate(inflater, container, false)

        ft2back = binding.root.findViewById(R.id.ft2back)

        ft2back.setOnClickListener {
            findNavController().popBackStack()
        }

        appointmentButton.setOnClickListener {
            val bottomSheetFragment = MyBottomSheetFragment()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
        }

        return binding.root
    }
}