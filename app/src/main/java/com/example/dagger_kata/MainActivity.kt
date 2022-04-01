package com.example.dagger_kata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var info: Info

    @Inject
    @SomethingA
    lateinit var somethingA: Something

    @Inject
    @SomethingB
    lateinit var somethingB: Something

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.text_view)
        DaggerMagicBox.create().poke(this)
        textView.text = info.text

        Log.e("Printing somethingA", "${somethingA.coolText}")
        Log.e("Printing somethingB", "${somethingB.coolText}")
    }
}
