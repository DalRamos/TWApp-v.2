package com.oop.twapp

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CalendarView
import android.widget.CheckBox
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.oop.twapp.databinding.BottomSheetLayoutBinding

class MyBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding: BottomSheetLayoutBinding
    private lateinit var calendar: CalendarView
    private lateinit var check1: CheckBox
    private lateinit var check2: CheckBox
    private lateinit var check3: CheckBox
    private lateinit var check4: CheckBox
    private lateinit var check5: CheckBox
    private lateinit var check6: CheckBox
    private lateinit var check7: CheckBox
    private lateinit var check8: CheckBox
    private lateinit var check9: CheckBox
    private lateinit var appointmentbtn: Button
    private lateinit var p0: DBReservation

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = BottomSheetLayoutBinding.inflate(inflater, container, false)

        check1 = binding.root.findViewById(R.id.chip1)
        check2 = binding.root.findViewById(R.id.chip2)
        check3 = binding.root.findViewById(R.id.chip)
        check4 = binding.root.findViewById(R.id.chip3)
        check5 = binding.root.findViewById(R.id.chip4)
        check6 = binding.root.findViewById(R.id.chip6)
        check7 = binding.root.findViewById(R.id.chip7)
        check8 = binding.root.findViewById(R.id.chip8)
        check9 = binding.root.findViewById(R.id.chip9)
        appointmentbtn = binding.root.findViewById(R.id.confirmButton)
        calendar = binding.root.findViewById(R.id.calendarView)
        p0 = DBReservation(this.context)

        calendar.setOnDateChangeListener{
            view, year, month, dayOfMonth ->
            val selectedDate = String.format("%04d-%02d-%02d", year, month + 1, dayOfMonth)
            if (selectedDate.isEmpty()){
                Toast.makeText(this.context, "Please select a date", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this.context, "You chose $selectedDate", Toast.LENGTH_SHORT).show()
            }

        }
        val checkboxArray = arrayOf(check1, check2, check3, check4, check5, check6, check7, check8, check9)
        for (checkBox in checkboxArray){
            checkBox.setOnClickListener{
                buttonView ->
                if (checkBox.isChecked){
                    Toast.makeText(this.context, "You chose $checkBox", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this.context, "Choose a time", Toast.LENGTH_SHORT).show()
                }
            }
        }
        checkboxArray[0].isChecked =  true

        appointmentbtn.setOnClickListener{
            val datecalendar = calendar.date.toString()
            val boxcheck = checkboxArray.toString()
            val reservedata = p0.reservationdata(datecalendar, boxcheck)

            if (TextUtils.isEmpty(datecalendar) || TextUtils.isEmpty(boxcheck)){
                Toast.makeText(this.context, "Please select date and time", Toast.LENGTH_SHORT).show()
            }
            else{
                if (reservedata){
                    Toast.makeText(this.context, "You have successfully set up an appointment\n Go to your appointment page", Toast.LENGTH_SHORT).show()

                }
            }
        }
        return binding.root
    }

}
