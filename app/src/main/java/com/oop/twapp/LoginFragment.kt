package com.oop.twapp

import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation


class LoginFragment : Fragment() {

    private lateinit var btnLogin: Button
    private lateinit var signUp: TextView
    private lateinit var edituser: EditText
    private lateinit var editpword: EditText
    private lateinit var dbh: DBHelper

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        btnLogin = view.findViewById(R.id.btnSignup)
        signUp = view.findViewById(R.id.signUp)
        edituser = view.findViewById(R.id.editLogin)
        editpword = view.findViewById(R.id.editPassword)
        dbh = DBHelper(this.context)

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
                    Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_homeFragment)
                }
                else{
                    Toast.makeText(this.context, "Wrong Username and Password", Toast.LENGTH_SHORT).show()
                }
            }
        }
        signUp.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_signupFragment )
            Log.i("test","clicked")
        }



        return view
    }
}