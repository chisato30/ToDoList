package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState) == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container,FragmentTitle.newInstance())
                .commitNow()
        }
    }
}
