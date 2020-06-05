package com.sumanta.sdnews.data.db

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sumanta.sdnews.data.db.entities.User
import com.sumanta.sdnews.util.Constants
import com.sumanta.sdnews.util.Constants.Companion.CURRENT_USER_ID

interface UserDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(user: User) : Long

    @Query("SELECT * FROM user WHERE uid = $CURRENT_USER_ID")
    fun getUser() : LiveData<User>

}