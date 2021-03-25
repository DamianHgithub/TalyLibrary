package com.example.talyexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taly.Taly

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Taly.tag("test").m(1)
        Taly.tag("s").
    }
}