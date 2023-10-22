package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentScience43Binding

class Science43Fragment : Fragment() {

    private lateinit var binding: FragmentScience43Binding
    private lateinit var appointmentButton: Button
    private lateinit var sci43back: ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentScience43Binding.inflate(layoutInflater, container, false)

        appointmentButton = binding.root.findViewById(R.id.appointmentButton)
        sci43back = binding.root.findViewById(R.id.sci43back)

        appointmentButton.setOnClickListener {
            val bottomSheetFragment = MyBottomSheetFragment()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
        }

        sci43back.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }


}