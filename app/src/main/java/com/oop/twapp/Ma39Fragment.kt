package com.oop.twapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentMa39Binding


class Ma39Fragment : Fragment() {

    private lateinit var binding: FragmentMa39Binding
    private lateinit var appointmentButton: Button
    private lateinit var maback: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentMa39Binding.inflate(inflater, container, false)

        appointmentButton = binding.root.findViewById(R.id.appointmentButton)
        maback = binding.root.findViewById(R.id.maback)

        appointmentButton.setOnClickListener {
            val bottomSheetFragment = MyBottomSheetFragment()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
        }

        maback.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }
}