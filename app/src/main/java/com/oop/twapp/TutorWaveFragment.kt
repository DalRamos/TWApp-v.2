package com.oop.twapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentTutorWaveBinding

class TutorWaveFragment : Fragment() {

    private lateinit var binding: FragmentTutorWaveBinding
    private lateinit var twaBack: ImageView
    private lateinit var make: TextView
    private lateinit var team: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTutorWaveBinding.inflate(inflater, container, false)

        twaBack = binding.root.findViewById(R.id.twaBack)
        make = binding.root.findViewById(R.id.make)
        team = binding.root.findViewById(R.id.team)

        twaBack.setOnClickListener {
            findNavController().popBackStack()
        }

        make.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_tutorWaveFragment_to_tabFragment)
        }



        return binding.root
    }
}