package com.enigmacamp.mandiricode

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface CustomerDao {
    @Query("SELECT * FROM customer")
    fun getCustomerAll() : List<Customer>

    @Query("SELECT * FROM customer WHERE uid=:id")
    fun getCustomerById(id : Int) : Customer

    @Insert
    fun insert(customer: Customer)

    @Delete
    fun delete(customer: Customer)

}