package com.blannon_network.postcard

sealed class Orientation{
    data class Vertical(
        val alignment: VerticalAlignment = VerticalAlignment.TopToBottom,
        val animation: VerticalAnimation = VerticalAnimation.ToRight
    ): Orientation()

    data class Horizontal(
        val alignment: HorizontalAlignment = HorizontalAlignment.StartToEnd,
        val animation: HorizontalAnimation = HorizontalAnimation.FromTop
    ): Orientation()
}