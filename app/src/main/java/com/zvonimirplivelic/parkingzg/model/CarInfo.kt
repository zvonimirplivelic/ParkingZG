package com.zvonimirplivelic.parkingzg.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "car_info")
class CarInfo(
    @ColumnInfo(name = "plate_number")
    val plateNumber: String,
    @ColumnInfo(name = "car_manufacturer")
    val carManufacturer: String,
    @ColumnInfo(name = "car_model")
    val carModel: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}