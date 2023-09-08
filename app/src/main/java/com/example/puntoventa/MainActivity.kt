package com.example.puntoventa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //Se crea la variable recyclerView
    private lateinit var recyclerView: RecyclerView
    //Se crea el arrayList de items
    private lateinit var itemList: ArrayList<Item>
    //Se crea la variable del adapter
    private lateinit var itemAdapter: ItemAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Se inicia el recyclerView
        recyclerView = findViewById(R.id.recyclerView)
        //
        recyclerView.setHasFixedSize(true)
        //Se agrega el layout del recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)

        //Asignacion de items
        itemList = ArrayList()
        itemList.add(Item("Papas", 50.00, 3))
        itemList.add(Item("Coca", 1000.00, 5))
        //Agregar los items al adapter
        itemAdapter = ItemAdapter(itemList)
        //Se asigna el adapter
        recyclerView.adapter = itemAdapter
    }
}