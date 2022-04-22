package com.example.dagger_kata

import dagger.Module
import dagger.Provides

@Module
object MagicBoxModule {

    @Provides
    fun providesSomething(): Something = Something()

    @[Provides SomethingA]
    fun providesSomethingWithA(): Something = Something()

    @[Provides SomethingB]
    fun providesSomethingWithB(): Something = object: Something() {
        override var coolText = "Some text for Something implementation with SomethingB qualifier."
    }

}