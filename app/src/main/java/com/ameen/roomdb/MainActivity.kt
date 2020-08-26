package com.ameen.roomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val postDatabase = PostDatabase.getInstance(this)!!
        postDatabase.postDao()?.insertPost(Post(50, "Ameen", "Hello Room"))
        postDatabase.postDao()?.insertPost(Post(50, "Ameen", "Hello Room"))
        postDatabase.postDao()?.insertPost(Post(50, "Ameen", "Hello Room"))

    }
}