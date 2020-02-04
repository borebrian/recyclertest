package com.example.recyclertest

data class Hobby(var title:String)

object Supplier{
    val hobbies= listOf<Hobby>(
        Hobby("Lamborgini"),
        Hobby("Ferari"),
        Hobby("Hammer"),
        Hobby("Mitsubishi"),
        Hobby("Isuzu"),
        Hobby("Bentley"),

        Hobby("Chevrolet")


    )

}
