package com.ameen.roomdb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "post_table")
data class Post(
    @ColumnInfo(name = "userId") var userId: Int,
    @ColumnInfo(name = "title") var title: String?,
    @ColumnInfo(name = "body") var body: String?) {

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
}