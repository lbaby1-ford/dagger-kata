package com.example.dagger_kata

import dagger.Component

@Component(modules = [InfoModule::class])
interface InfoComponent {
    fun inject(app: MainActivity)
}