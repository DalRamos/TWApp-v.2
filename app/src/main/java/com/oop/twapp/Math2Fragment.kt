package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import com.oop.twapp.databinding.FragmentMath1Binding
import com.oop.twapp.databinding.FragmentMath2Binding

class Math2Fragment : Fragment() {

    private lateinit var binding: FragmentMath2Binding
    private lateinit var appointmentButton: Button
    private lateinit var mathback: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMath2Binding.inflate(inflater, container, false)

        appointmentButton = binding.root.findViewById(R.id.appointmentButton)
        mathback = binding.root.findViewById(R.id.mathBack)

        appointmentButton.setOnClickListener {
            val bottomSheetFragment = MyBottomSheetFragment()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
        }



        return binding.root
    }
}