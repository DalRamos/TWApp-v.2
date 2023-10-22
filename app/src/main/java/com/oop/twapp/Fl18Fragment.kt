package com.oop.twapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentFl18Binding


class Fl18Fragment : Fragment() {

    private lateinit var binding: FragmentFl18Binding
    private lateinit var appointmentButton: Button
    private lateinit var flback: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentFl18Binding.inflate(inflater, container, false)

        appointmentButton = binding.root.findViewById(R.id.appointmentButton)
        flback = binding.root.findViewById(R.id.flback)

        appointmentButton.setOnClickListener {
            val bottomSheetFragment = MyBottomSheetFragment()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
        }

        flback.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }
}