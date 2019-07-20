package com.indieteam.dagger2_example.modules

import android.content.Context
import com.indieteam.dagger2_example.business.UpdateUI
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UIModule {

    @Singleton
    @Provides fun getUpdateUI(context: Context): UpdateUI {
        return UpdateUI(context)
    }
}