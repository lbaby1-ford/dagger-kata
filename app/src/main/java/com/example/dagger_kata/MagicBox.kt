package com.example.dagger_kata

import dagger.Component

@Component
interface MagicBox {

    fun poke(activity: MainActivity)

}