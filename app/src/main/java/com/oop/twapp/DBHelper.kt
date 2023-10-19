package com.oop.twapp

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context?) : SQLiteOpenHelper(context, "Userdata", null, 12) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("create table Userdatalist(FName TEXT, LName TEXT, MName TEXT, Address TEXT, Contact INT, Username TEXT primary key, Password TEXT, ConfirmPassword TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("drop table if exists Userdatalist")
    }

    fun saveuserdata(FName: String, LName: String, MName: String, Address: String, Contact: String, Username: String, Password: String, ConfirmPassword: String): Boolean {
        val db = this.writableDatabase
        val cv = ContentValues()
        cv.put("FName", FName)
        cv.put("LName", LName)
        cv.put("MName", MName)
        cv.put("Address", Address)
        cv.put("Contact", Contact)
        cv.put("Username", Username)
        cv.put("Password", Password)
        cv.put("ConfirmPassword", ConfirmPassword)

        if (Password == ConfirmPassword){
            val result = db.insert("Userdatalist", null, cv)
            db.close()
            return result != -1L
        }
        return false
    }

    fun checkuserpass(Username: String, Password: String): Boolean {
        val db = this.writableDatabase
        val query =
            "select * from Userdatalist where username= '$Username' and password= '$Password'"
        val cursor = db.rawQuery(query, null)
        if (cursor.count <= 0) {
            cursor.close()
            return false
        }
        cursor.close()
        return true
    }
}