package com.example.roomdatabase.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "master_user")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int=0,
    val firstname: String,
    val lastname: String,
    val age: Int


) {


}