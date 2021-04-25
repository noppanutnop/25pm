package com.example.a25pm

import android.util.Log
import com.google.firebase.database.*

class AirRepository(
    private val rootRef: DatabaseReference = FirebaseDatabase.getInstance().reference,
    private val ref: DatabaseReference = rootRef.child(REF_PATH)
) {

    fun getResponse(callback: ((AirData) -> Unit)?) {

        ref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                snapshot.getValue(AirData::class.java)?.let { model ->
//                    log(model)
                    callback?.invoke(model)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("implemented when you want to take do something when error")
            }
        })
    }

    companion object {

        const val REF_PATH = "data"

    }


    /***
     *  Mock -> Use when want to update model
     */

    init {
//        updateData()
    }

    private fun updateData() {

        val data = AirData(
            bottom = "0",
            counter = "97",
            humidity = "66",
            temperature = "22.7",
            number = "358",
            pm1 = "50",
            pm10 = "70",
            pm25 = "60",
            position = "0",
            remain = "77"
        )

        ref.apply {
            child("humidity").setValue(data.humidity)
            child("temperature").setValue(data.temperature)
            child("remain").setValue(data.remain)
            child("pm25").setValue(data.pm25)
        }
    }

    private fun log(model: AirData) {
        Log.d("firebase humidity", "Value is: ${model.humidity}")
        Log.d("firebase temperature", "Value is: ${model.temperature}")
        Log.d("firebase remain", "Value is: ${model.remain}")
        Log.d("firebase pm25", "Value is: ${model.pm25}")
    }

}