package com.oop.twapp

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.oop.twapp.databinding.FragmentSignupBinding

class SignupFragment : Fragment() {

    private lateinit var binding: FragmentSignupBinding
    private lateinit var uname: EditText
    private lateinit var pword: EditText
    private lateinit var cpword: EditText
    private lateinit var fname: EditText
    private lateinit var lname: EditText
    private lateinit var mname: EditText
    private lateinit var address: EditText
    private lateinit var contactnum: EditText
    private lateinit var signupbtn: Button
    private lateinit var db: DBHelper
    private lateinit var signupBack: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignupBinding.inflate(inflater, container, false)

        uname = binding.root.findViewById(R.id.editTextTextEmailAddress)
        pword = binding.root.findViewById(R.id.editTextTextPassword)
        cpword = binding.root.findViewById(R.id.editTextTextPassword2)
        fname = binding.root.findViewById(R.id.firstName)
        lname = binding.root.findViewById(R.id.lastName)
        mname = binding.root.findViewById(R.id.middleName)
        address = binding.root.findViewById(R.id.enterAddress)
        contactnum = binding.root.findViewById(R.id.contactnumber)
        signupbtn = binding.root.findViewById(R.id.btnSignup)
        signupBack = binding.root.findViewById(R.id.signupBack)
        db = DBHelper(this.context)

        signupBack.setOnClickListener {
            findNavController().popBackStack()
        }

        signupbtn.setOnClickListener{
            val unametext = uname.text.toString()
            val pwordtext = pword.text.toString()
            val cpwordtext = cpword.text.toString()
//            val fnametext = fname.text.toString()
//            val lnametext = lname.text.toString()
//            val mnametext = mname.text.toString()
//            val addresstext = address.text.toString()
//            val contactnumtext = contactnum.text.toString().toInt()
            val savedata = db.insertdata(unametext, pwordtext)
//            val infouser = db.userinfo(fnametext, lnametext, mnametext, addresstext, contactnumtext)

            if (TextUtils.isEmpty(unametext) || TextUtils.isEmpty(pwordtext) || TextUtils.isEmpty(cpwordtext)){
                Toast.makeText(this.context, "Add Username, Password and Confirm Password", Toast.LENGTH_SHORT).show()
            }
            else{
                if (pwordtext.equals(cpwordtext)){
                    if (savedata==true){
                        Toast.makeText(this.context, "Signup Successful", Toast.LENGTH_SHORT).show()
                        Navigation.findNavController(it).navigate(R.id.action_signupFragment_to_loginFragment)
                    }
                    else{
                        Toast.makeText(this.context, "User Exists", Toast.LENGTH_SHORT).show()
                    }

                }else{
                    Toast.makeText(this.context, "Password Not Match", Toast.LENGTH_SHORT).show()
                }
            }
//            db.userinfo(infouser)

        }




        return binding.root
    }
}