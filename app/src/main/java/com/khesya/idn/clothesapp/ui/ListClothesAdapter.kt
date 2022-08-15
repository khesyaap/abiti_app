package com.khesya.idn.clothesapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.khesya.idn.clothesapp.R
import com.khesya.idn.clothesapp.data.ClothesData
import com.squareup.picasso.Picasso

class ListClothesAdapter(private val listClothes:ArrayList<ClothesData>) :
    RecyclerView.Adapter<ListClothesAdapter.ListViewHolder>(){
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemCLickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemCLickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvClothes: TextView = itemView.findViewById(R.id.tv_item_clothes)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_item_price)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_row_clothes, viewGroup, false)
        return  ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val clothes = listClothes[position]

        clothes.photo?.let {
            Picasso.with(holder.itemView.context)
                .load(it)
                .resize(50,50)
                .into(holder.imgPhoto)
        }
        holder.tvClothes.text = clothes.clothes
        holder.tvPrice.text = clothes.price
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClickedData(listClothes[holder.adapterPosition]) }

    }

    override fun getItemCount(): Int {
        return listClothes.size
    }

    interface OnItemClickCallback {
        fun onItemClickedData(data: ClothesData)
    }
}


