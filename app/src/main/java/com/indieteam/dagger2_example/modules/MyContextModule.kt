package com.indieteam.dagger2_example.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MyContextModule(private val context: Context) {

    @Singleton
    @Provides
    fun getContext(): Context {
        return context
    }
}