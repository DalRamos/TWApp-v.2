package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentHistory25Binding
import com.oop.twapp.databinding.FragmentMath1Binding

class History25Fragment : Fragment() {

    private lateinit var binding: FragmentHistory25Binding
    private lateinit var appointmentButton: Button
    private lateinit var hback: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistory25Binding.inflate(inflater, container, false)

        appointmentButton = binding.root.findViewById(R.id.appointmentButton)
        hback = binding.root.findViewById(R.id.hBack)

        appointmentButton.setOnClickListener {
            val bottomSheetFragment = MyBottomSheetFragment()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
        }

        hback.setOnClickListener {
            findNavController().popBackStack()
        }


        return binding.root
    }
}