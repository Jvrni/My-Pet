package com.example.destinations

sealed class Destinations(val route: String) {
    data object Splash: Destinations("splash")
    data object Home: Destinations("home")
}