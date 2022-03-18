package com.example.dagger_kata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var info: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text_view)
        DaggerInfoComponent.create().inject(this)
        textView.text = info.text
    }
}
