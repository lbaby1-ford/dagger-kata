package com.example.dagger_kata

import android.util.Log
import javax.inject.Inject

class Info @Inject constructor() {

    val text : String = "Hello from Info"

    init {
        Log.d("Dagger", ": Info Initialized at 😎 ${System.currentTimeMillis()} ")
    }

}