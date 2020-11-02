package com.zvonimirplivelic.parkingzg.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class CarInfo (
    val prefix: String,
    val number: String,
    val suffix: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}