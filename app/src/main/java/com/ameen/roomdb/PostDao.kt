package com.ameen.roomdb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable

@Dao
interface PostDao {
    @Insert
    fun insertPost(post: Post?): Completable

    @Query("select * from post_table")
    fun getPosts(): Observable<List<Post>>
}