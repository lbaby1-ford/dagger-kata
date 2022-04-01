package com.example.dagger_kata

import dagger.Component

@Component(modules = [MagicBoxModule::class])
interface MagicBox {

    fun poke(activity: MainActivity)

}