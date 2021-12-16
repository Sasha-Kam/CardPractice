package com.example.cardpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var carRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carList:List<Car> = listOf(
            Car("UAZ 469", R.drawable.uaz_469),
            Car("UAZ Hunter", R.drawable.uaz2),
            Car("UAZ Patriot", R.drawable.uaz3)

        )


        carRecyclerView=findViewById(R.id.car_recycler_view)

        carRecyclerView.layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        carRecyclerView.adapter= CarAdapter(carList)


    }
}