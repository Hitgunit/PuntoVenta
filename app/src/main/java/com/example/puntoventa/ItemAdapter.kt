package com.example.puntoventa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//Se crea la clase para adaptar el recyclerView con los parametros del Adapter
class ItemAdapter (val ItemList: ArrayList<Item>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    //Se inicializa el ViewHolder con los items que mostrara el recylcerView
    class ItemViewHolder(itemView: View ): RecyclerView.ViewHolder(itemView){
        val name: TextView = itemView.findViewById(R.id.txtItem)
        val price: TextView = itemView.findViewById(R.id.txtPrice)
    }

    //Se lanza el inflar los objetos deseados
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return ItemViewHolder(layout)
    }

    //Se obtiene el total de items en el recyclerView
    override fun getItemCount(): Int {
        return ItemList.size
    }

    //La logica de el recyclerView
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = ItemList[position]
        holder.name.text = item.name
        holder.price.text = item.price.toString()
    }

}