package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentCom16Binding

class Com16Fragment : Fragment() {

    private lateinit var binding: FragmentCom16Binding
    private lateinit var appoinmentButton: Button
    private lateinit var cback: ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCom16Binding.inflate(layoutInflater, container, false)

        appoinmentButton = binding.root.findViewById(R.id.appointmentButton)
        cback = binding.root.findViewById(R.id.cback)

        appoinmentButton.setOnClickListener {
            val bottomSheetFragment = MyBottomSheetFragment()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
        }

        cback.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }


}