package com.example.roomdatabase.data


import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserViewModel(val repository: UserRepository) : ViewModel() {

     fun addUser(user: User) {
        CoroutineScope(Dispatchers.IO).launch {
            repository.addUser(user)
        }

    }

    fun getAllUser() {
        CoroutineScope(Dispatchers.IO).launch {
            repository.getAllUser()
        }
    }

    fun updateUser(user: User){
        CoroutineScope(Dispatchers.IO).launch {
            repository.updateUser(user)
        }
    }
    fun deleteUser(user: User) {
        CoroutineScope(Dispatchers.IO).launch {
            repository.deleteUser(user)
        }
    }

//    fun getUserById(id:Int) {
//        CoroutineScope(Dispatchers.IO).launch {
//            repository.getUserById(id)
//        }
//    }
}