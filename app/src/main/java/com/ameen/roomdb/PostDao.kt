package com.ameen.roomdb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PostDao {
    @Insert
    fun insertPost(post: Post?)

    @Query("select * from post_table")
    fun getPosts(): List<Post>
}