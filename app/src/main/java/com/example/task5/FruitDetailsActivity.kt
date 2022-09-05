package com.example.task5

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

class FruitDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fruit_details_activity)
        val selectedFruit : Fruits? = intent.getParcelableExtra("Fruit")
        val fruitnamelabel: TextView = findViewById(R.id.fruit_name)
        val fruitimagelabel : ImageView = findViewById(R.id.fruit_image)
        val fruitdescriptionlabel : TextView = findViewById(R.id.fruit_description)
        fruitnamelabel.text = "${selectedFruit?.fruitName}"
        fruitimagelabel.setImageResource(selectedFruit!!.fruitImage)
        fruitdescriptionlabel.text = "${selectedFruit?.fruitDescription}"

    }
}