package com.blannon_network.postcard

import androidx.annotation.DrawableRes

data class Publisher(
    val name: String,
    @DrawableRes val image: Int,
    val job: String
)
