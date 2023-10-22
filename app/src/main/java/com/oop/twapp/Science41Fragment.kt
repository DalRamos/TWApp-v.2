package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentFTCard1Binding
import com.oop.twapp.databinding.FragmentScience41Binding

class Science41Fragment : Fragment() {

    private lateinit var binding: FragmentScience41Binding
    private lateinit var appoinmentButton: Button
    private lateinit var sci41back: ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentScience41Binding.inflate(layoutInflater, container, false)

        appoinmentButton = binding.root.findViewById(R.id.appointmentButton)
        sci41back = binding.root.findViewById(R.id.sci41back)

        appoinmentButton.setOnClickListener {
            val bottomSheetFragment = MyBottomSheetFragment()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
        }

        sci41back.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }

}