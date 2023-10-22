package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentScience44Binding

class Science44Fragment : Fragment() {

    private lateinit var binding: FragmentScience44Binding
    private lateinit var appointmentButton: Button
    private lateinit var sci44back: ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScience44Binding.inflate(layoutInflater, container, false)

        appointmentButton = binding.root.findViewById(R.id.appointmentButton)
        sci44back = binding.root.findViewById(R.id.sci44back)

        appointmentButton.setOnClickListener {
            val bottomSheetFragment = MyBottomSheetFragment()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
        }

        sci44back.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }


}