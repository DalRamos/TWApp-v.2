package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentScience42Binding

class Science42Fragment : Fragment() {

    private lateinit var binding: FragmentScience42Binding
    private lateinit var appointmentButton: Button
    private lateinit var sci42back: ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScience42Binding.inflate(layoutInflater, container, false)

        appointmentButton = binding.root.findViewById(R.id.appointmentButton)
        sci42back = binding.root.findViewById(R.id.sci42back)

        appointmentButton.setOnClickListener {
            val bottomSheetFragment = MyBottomSheetFragment()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
        }

        sci42back.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }


}