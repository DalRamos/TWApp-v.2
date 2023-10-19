package com.oop.twapp

import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
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
    ): View {
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
            val fnametext = fname.text.toString()
            val lnametext = lname.text.toString()
            val mnametext = mname.text.toString()
            val addresstext = address.text.toString()
            val contactnumINT = contactnum.text.toString()

            Log.i("test", "clicked")


            if (TextUtils.isEmpty(fnametext) || TextUtils.isEmpty(lnametext) || TextUtils.isEmpty(mnametext) || TextUtils.isEmpty(addresstext) || TextUtils.isEmpty(contactnumINT) || TextUtils.isEmpty(unametext) || TextUtils.isEmpty(pwordtext) || TextUtils.isEmpty(cpwordtext)){
                Toast.makeText(this.context, "Complete all the information needed", Toast.LENGTH_SHORT).show()
            }
            else{
                if (pwordtext == cpwordtext){
                    val savedata = db.saveuserdata(fnametext, lnametext, mnametext, addresstext, contactnumINT, unametext, pwordtext, cpwordtext)
                    if (savedata){
                        Toast.makeText(this.context, "Signup Successful", Toast.LENGTH_SHORT).show()
                        findNavController().navigate(SignupFragmentDirections.actionSignupFragmentToLoginFragment())
                    }
                    else{
                        Toast.makeText(this.context, "User Exists", Toast.LENGTH_SHORT).show()
                    }

                }else{
                    Toast.makeText(this.context, "Password Not Match", Toast.LENGTH_SHORT).show()
                }
            }

        }




        return binding.root
    }
}