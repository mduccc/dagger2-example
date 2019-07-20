package com.indieteam.dagger2_example.business

import android.content.Context
import com.indieteam.dagger2_example.MainActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Singleton

@Singleton
class UpdateUI(private val context: Context) {

    fun updateInfo() {
        (context as MainActivity).info_.text = "Hello Dagger 2 from UpdateUI()"
    }

    fun updateAbout() {
        (context as MainActivity).about_.text = "Hello, this is Android Application Example use Dagger2 from UpdateUI()"
    }
}