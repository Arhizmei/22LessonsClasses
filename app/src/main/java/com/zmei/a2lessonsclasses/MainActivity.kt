package com.zmei.a2lessonsclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zmei.a2lessonsclasses.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        bind = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)
    }
}