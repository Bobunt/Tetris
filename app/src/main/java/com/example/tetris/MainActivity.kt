package com.example.tetris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tetris.Route.showMainFragmentMain

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMainFragmentMain(supportFragmentManager)
    }
}