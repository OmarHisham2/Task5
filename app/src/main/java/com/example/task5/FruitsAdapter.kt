package com.example.task5

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class FruitsAdapter(private val fruitsList: List<Fruits>) :
    RecyclerView.Adapter<FruitsAdapter.FruitsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitsViewHolder {
        val itemFruitview =
            LayoutInflater. from(parent.context).inflate(R.layout.item_layout, parent, false)
        return FruitsViewHolder(itemFruitview)
    }

    override fun onBindViewHolder(holder: FruitsViewHolder, position: Int) {
        val currentFruit = fruitsList[position]
        holder.bindFruit(currentFruit)

    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }

    //*********************************************************************************************/

    inner class FruitsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val fruitName: TextView
        private val fruitImage: ImageView



        init {
            fruitName = itemView.findViewById(R.id.fruit_name)
            fruitImage = itemView.findViewById(R.id.fruit_image)
            fruitImage.setOnClickListener() {
                        openDetailsActivity(fruitName.toString())
            }
        }

        private fun openDetailsActivity(fruitName : String) {
            val currentFruit = fruitsList[position]
            val intent = Intent(itemView.context, FruitDetailsActivity::class.java)
            val fruitObj = Fruits(currentFruit.fruitName,currentFruit.fruitImage,currentFruit.fruitDescription)
            intent.putExtra("Fruit", fruitObj)
            itemView.context.startActivity(intent)

        }

        fun bindFruit(fruits: Fruits) {
            fruitName.text = fruits.fruitName
            fruitImage.setImageResource(fruits.fruitImage)
        }

    }
}


