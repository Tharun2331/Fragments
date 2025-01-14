package com.example.fragments
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val fragment1: Button = findViewById(R.id.fragment1)
        val fragment2: Button = findViewById(R.id.fragment2)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FLfragment, firstFragment)
            commit()
        }

        fragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.FLfragment, firstFragment)
                commit()
            }
        }

        fragment2.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.FLfragment, secondFragment)
                commit()
            }
        }

        }
    }