package com.zvonimirplivelic.parkingzg.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.zvonimirplivelic.parkingzg.R
import com.zvonimirplivelic.parkingzg.model.CarInfo
import com.zvonimirplivelic.parkingzg.util.PlateListDiffUtil
import kotlinx.android.synthetic.main.item_plate_list.view.*

class PlateListAdapter(val plateList: ArrayList<CarInfo>) :
    ListAdapter<CarInfo, PlateListAdapter.PlateViewHolder>(PlateListDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlateViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_plate_list, parent, false)
        return PlateViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PlateViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemCount(): Int = plateList.size


    class PlateViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(plate: CarInfo?) {
            itemView.tvPlateNumber.text = plate?.plateNumber
        }
    }
}