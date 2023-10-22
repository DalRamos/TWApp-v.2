package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentScience46Binding

class Science46Fragment : Fragment() {

    private lateinit var binding: FragmentScience46Binding
    private lateinit var appoinmentButton: Button
    private lateinit var sci46back: ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScience46Binding.inflate(layoutInflater, container, false)

        appoinmentButton = binding.root.findViewById(R.id.appointmentButton)
        sci46back = binding.root.findViewById(R.id.sci46back)

        appoinmentButton.setOnClickListener {
            val bottomSheetFragment = MyBottomSheetFragment()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
        }

        sci46back.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }


}