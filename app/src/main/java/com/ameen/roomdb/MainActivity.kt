package com.ameen.roomdb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.internal.operators.completable.CompletableObserveOn
import io.reactivex.rxjava3.schedulers.Schedulers

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val postDatabase = PostDatabase.getInstance(this)!!

        postDatabase.postDao()?.insertPost(Post(50, "Ameen", "Hello Room"))
            ?.subscribeOn(Schedulers.computation())
            ?.subscribe()

    }
}