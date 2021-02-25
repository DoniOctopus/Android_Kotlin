package com.enigmacamp.mandiricode

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Customer (
    @PrimaryKey(autoGenerate = true) val uid : Int = 0,
    @ColumnInfo(name = "name") val name : String,
    @ColumnInfo(name = "addresss1") val address1 : String,
    @ColumnInfo(name = "addresss2") val address2 : String,
)