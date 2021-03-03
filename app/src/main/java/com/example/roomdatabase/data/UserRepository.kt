package com.example.roomdatabase.data

import androidx.lifecycle.LiveData

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User) {
        userDao.addUser(user)
    }

      fun deleteUser(user: User) {
        userDao.delete(user)
    }

    fun getAllUser() {
        userDao.readAllData()
    }

//     fun getUserById(id: Int) {
//        userDao.getUserById(id)
//    }

     fun updateUser( user: User) {
        userDao.updateUser( user)
    }

}