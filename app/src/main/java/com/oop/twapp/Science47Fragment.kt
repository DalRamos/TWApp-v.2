package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentScience47Binding

class Science47Fragment : Fragment() {

    private lateinit var binding: FragmentScience47Binding
    private lateinit var appoinmentButton: Button
    private lateinit var sci47back: ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScience47Binding.inflate(layoutInflater, container, false)

        appoinmentButton = binding.root.findViewById(R.id.appointmentButton)
        sci47back = binding.root.findViewById(R.id.sci47back)

        appoinmentButton.setOnClickListener {
            val bottomSheetFragment = MyBottomSheetFragment()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
        }

        sci47back.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }


}