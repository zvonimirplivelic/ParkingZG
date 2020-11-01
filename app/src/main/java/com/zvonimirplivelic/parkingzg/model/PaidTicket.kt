package com.zvonimirplivelic.parkingzg.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PaidTicket (
    val paidTime: String,
    val paidZone: String,
    val carPlate: String
){
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}