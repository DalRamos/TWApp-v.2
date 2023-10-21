package com.oop.twapp

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBReservation(context: Context?) : SQLiteOpenHelper(context, "Reservation", null, 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("create table Appointment(date DATE, time TIME)")

    }

    override fun onUpgrade(p0: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        p0?.execSQL("drop table if exists Appointment")

    }
    fun reservationdata(date: String, time: String): Boolean {
        val p0 = this.writableDatabase
        val values = ContentValues()
        values.put("Date", date)
        values.put("Time", time)

        val res = p0.insert("Appointment", null, values)
        p0.close()
        return res != -1L
    }

}