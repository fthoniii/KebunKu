package com.example.kebunku.utils

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.kebunku.activities.mainActivity.PlantAdapter
import com.example.kebunku.database.Plant

@BindingAdapter("addPlantsList")
fun addPlantsList(recyclerView: RecyclerView, data: List<Plant>?){
    val adapter = recyclerView.adapter as PlantAdapter
    if (data != null) {
        adapter.setData(data)
    }
}
