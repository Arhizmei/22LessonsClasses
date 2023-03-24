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
        var user = User("Sergey", "00000", 23)
        var user2 = User("Andrey", "11111", 33)

        user.addAge(10)
        user2.addAge(5)
        user.printUserInfo()
        user2.printUserInfo()
        }
}