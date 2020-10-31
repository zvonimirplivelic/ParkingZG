package com.zvonimirplivelic.parkingzg.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class CarPlate (
    val prefix: String,
    val number: String,
    val sufix: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}