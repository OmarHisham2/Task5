package com.example.task5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.main_view)

        val listofFruits = getListOfFruits()

        recyclerView.adapter = FruitsAdapter(listofFruits)

    }

    private fun getListOfFruits(): List<Fruits> {
        val fruits = mutableListOf<Fruits>()
        fruits.add(Fruits("Apple", R.drawable.apple,"Price:EGP31.95/kg\nApprox 5 pieces/kg"))
        fruits.add(Fruits("Apricot",R.drawable.apricot,"Price:EGP79.95/kg\nApprox 20 pieces/kg"))
        fruits.add(Fruits("Banana",R.drawable.banana,"Price:EGP22.95/kg\nApprox 8 pieces/kg"))
        fruits.add(Fruits("Cherry", R.drawable.cherry,"Price:EGP20/kg\n"))
        fruits.add(Fruits("Kiwi",R.drawable.kiwi,"Price:EGP79.95/KG\nApprox 10 pieces/kKg"))
        fruits.add(Fruits("Lemon",R.drawable.lemon,"Price:EGP9.95/kg\nApprox 20 pieces/kg"))
        fruits.add(Fruits("Mango",R.drawable.mango,"Price:EGP 31.95 /kg\nApprox 4 pieces/kg"))
        fruits.add(Fruits("Orange",R.drawable.orange,"Price:EGP14.75/kg\n Approx 5 pieces/kg"))
        fruits.add(Fruits("Peach",R.drawable.peach,"Price:EGP47.95/kg\nApprox 10 pieces/kg"))
        fruits.add(Fruits("Pear",R.drawable.pear,"Price:EGP14.95/kg\nApprox 4 pieces/kg"))
        fruits.add(Fruits("Strawberry",R.drawable.strawberry,"Price:EGP4/kg\nGoods:Fresh"))
        fruits.add(Fruits("Tomato",R.drawable.tomato,"Price:EGP5.95/kg\nApprox 8 pieces/kg"))


    return fruits}


}