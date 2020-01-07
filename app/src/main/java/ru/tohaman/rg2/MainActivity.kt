package ru.tohaman.rg2

import android.os.Bundle
import ru.tohaman.rg2.activitys.MyDefaultActivity

class MainActivity : MyDefaultActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
