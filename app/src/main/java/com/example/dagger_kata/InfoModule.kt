package com.example.dagger_kata

import dagger.Module
import dagger.Provides

@Module
class InfoModule {

    @Provides
    fun provideInfo(): Info {
        return Info("Hello from Module!")
    }

}