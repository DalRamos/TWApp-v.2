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
import com.oop.twapp.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    private lateinit var btnLogin: Button
    private lateinit var signUp: TextView
    private lateinit var loginBack: ImageView
    private lateinit var edituser: EditText
    private lateinit var editpword: EditText
    private lateinit var dbh: DBHelper

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        btnLogin = binding.root.findViewById(R.id.btnSignup)
        signUp = binding.root.findViewById(R.id.signUp)
        loginBack = binding.root.findViewById(R.id.loginBack)
        edituser = binding.root.findViewById(R.id.editLogin)
        editpword = binding.root.findViewById(R.id.editPassword)
        dbh = DBHelper(this.context)

        loginBack.setOnClickListener {
            findNavController().popBackStack()
        }

        btnLogin.setOnClickListener{
            val useredtx = edituser.text.toString()
            val passedtx = editpword.text.toString()

            if (TextUtils.isEmpty(useredtx) || TextUtils.isEmpty(passedtx)){
                Toast.makeText(this.context, "Add Username and Password", Toast.LENGTH_SHORT).show()
            }
            else{
                val checkuser = dbh.checkuserpass(useredtx, passedtx)
                if (checkuser==true){
                    Toast.makeText(this.context, "Login Successful", Toast.LENGTH_SHORT).show()
                    Navigation.findNavController(it).navigate(R.id.action_loginFragment_to_homeFragment)
                }
                else{
                    Toast.makeText(this.context, "Wrong Username and Password", Toast.LENGTH_SHORT).show()
                }
            }
        }
        signUp.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_loginFragment_to_signupFragment)
        }



        return binding.root
    }
}