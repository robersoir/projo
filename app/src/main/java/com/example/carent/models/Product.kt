package com.example.carent.models

class Product {
    var name:String = ""
    var quantity:String = ""
    var price:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, quantity: String, price: String, imageUrl: String, id: String) {
        this.name = name
        this.quantity = quantity
        this.price = price
        this.imageUrl = imageUrl
        this.id = id
    }


data class Product(
    var id: String = "",
    val name: String = "",
    val description: String ="",
    val price: Double = 0.0,
    var imageUrl: String = ""
)

    constructor()
}