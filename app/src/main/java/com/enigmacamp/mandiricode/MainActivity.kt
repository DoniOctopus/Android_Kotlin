package com.enigmacamp.mandiricode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity(){

    lateinit var customerRepository: CustomerRepository
    lateinit var customerDao: CustomerDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        customerDao = AppDatabase.getDatabase(this).customerDao()
        customerRepository = CustomerRepository(customerDao)

        CoroutineScope(Dispatchers.IO).launch {
        customerRepository.registerNewCustomer(Customer(name ="Doni", address1 = "Enigma",address2 = "Camp"))
        val customerList = customerRepository.getCustomer()
        Log.d("Room",customerList.toString())
        val customer = customerRepository.getCustomerById(1)
        Log.d("Room",customer.toString())
        }
    }
}
