package com.oop.twapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FTAdapter(
    private val cardItems: List<FTCardItem>, // Comma should be used to separate parameters
    private val onItemClick: (FTCardItem) -> Unit
) : RecyclerView.Adapter<FTAdapter.CardViewHolder>() {
    inner class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardImageView: ImageView = itemView.findViewById(R.id.cardImage)
        val cardTextView: TextView = itemView.findViewById(R.id.cardText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.ft_cards, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val currentItem = cardItems[position]
        holder.cardImageView.setImageResource(currentItem.imageResId)
        holder.cardTextView.text = currentItem.text

        // Step 2: Set a click listener for each item
        holder.itemView.setOnClickListener {
            onItemClick(currentItem)
        }
    }

    override fun getItemCount() = cardItems.size
}

