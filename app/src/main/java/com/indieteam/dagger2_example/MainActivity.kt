package com.indieteam.dagger2_example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.indieteam.dagger2_example.modules.MyContextModule
import com.indieteam.dagger2_example.modules.UIModule
import com.indieteam.dagger2_example.business.UpdateUI
import com.indieteam.dagger2_example.component.DaggerMyComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    // this variable is initialized by Dagger2
    @Inject
    lateinit var updateUI: UpdateUI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerMyComponent.builder()
            .myContextModule(MyContextModule(this))
            .uIModule(UIModule())
            .build()

        component.poke(this)

        updateUI.updateInfo()
        updateUI.updateAbout()
    }
}
