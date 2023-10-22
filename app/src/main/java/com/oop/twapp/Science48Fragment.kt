package com.oop.twapp

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentScience48Binding

class Science48Fragment : Fragment() {

    private lateinit var binding: FragmentScience48Binding
    private lateinit var appoinmentButton: Button
    private lateinit var sci48back: ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentScience48Binding.inflate(layoutInflater, container, false)

        appoinmentButton = binding.root.findViewById(R.id.appointmentButton)
        sci48back = binding.root.findViewById(R.id.sci48back)

        appoinmentButton.setOnClickListener {
            val bottomSheetFragment = MyBottomSheetFragment()
            bottomSheetFragment.show(childFragmentManager, bottomSheetFragment.tag)
        }

        sci48back.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }


}