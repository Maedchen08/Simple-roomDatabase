package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.roomdatabase.data.User
import com.example.roomdatabase.data.UserDatabase
import com.example.roomdatabase.data.UserRepository
import com.example.roomdatabase.data.UserViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var userViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewModel()
//        userViewModel.addUser(User(firstname = "Sinta",lastname="Dewi",age =28))
        //getAll belom bisa
//        userViewModel.getAllUser()
//        userViewModel.updateUser(User(id = 1,firstname = "Sinta",lastname="Dewi",age =28) )
//        userViewModel.deleteUser(User(id = 4,firstname = "Sinta",lastname="Dewi",age =28))
//        userViewModel.getUserById(id = 1)


    }

    private fun initViewModel(){
        userViewModel = ViewModelProvider(this,object :ViewModelProvider.Factory{
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                val userDao = UserDatabase.getDatabase(this@MainActivity).userDao()
                val userRepository = UserRepository(userDao)
                return UserViewModel(userRepository) as T
            }
        }).get(UserViewModel::class.java)
    }
}