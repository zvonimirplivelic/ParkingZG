package com.zvonimirplivelic.parkingzg.util

import androidx.recyclerview.widget.DiffUtil
import com.zvonimirplivelic.parkingzg.model.CarInfo

class PlateListDiffUtil : DiffUtil.ItemCallback<CarInfo>() {
    override fun areItemsTheSame(oldItem: CarInfo, newItem: CarInfo): Boolean {
        return newItem.id == oldItem.id
    }

    override fun areContentsTheSame(oldItem: CarInfo, newItem: CarInfo): Boolean {
        return newItem.id == oldItem.id
    }
}