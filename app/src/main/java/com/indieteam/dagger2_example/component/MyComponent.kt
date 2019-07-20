package com.indieteam.dagger2_example.component

import com.indieteam.dagger2_example.MainActivity
import com.indieteam.dagger2_example.modules.MyContextModule
import com.indieteam.dagger2_example.modules.UIModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UIModule::class, MyContextModule::class])
interface MyComponent {
    @Singleton
    fun poke(app: MainActivity)
}