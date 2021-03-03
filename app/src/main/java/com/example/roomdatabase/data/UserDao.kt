package com.example.roomdatabase.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user: User)

    @Query("select*from master_user order by id asc")
    fun readAllData(): LiveData<List<User>>

    @Delete
     fun delete(user: User)

//    @Query("select*from master_user")
//     fun getUserById(id: Int): User

    @Update
     fun updateUser(user: User)




}