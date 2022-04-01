package com.example.dagger_kata

import dagger.Module
import dagger.Provides

@Module
object MagicBoxModule {

    @Provides
    fun providesSomething(): Something = Something()

}