package com.example.shayariapp.routing

sealed class ShayariRoutingItem (val route : String){
    object splashScreen : ShayariRoutingItem("splash")
    object categoryScreen : ShayariRoutingItem("category")
    object shayariListScreen : ShayariRoutingItem("shayari_list")
    object finalShayariView : ShayariRoutingItem("final-shayari_view")
}