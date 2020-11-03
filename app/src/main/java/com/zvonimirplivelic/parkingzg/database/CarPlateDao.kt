package com.zvonimirplivelic.parkingzg.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.zvonimirplivelic.parkingzg.model.CarInfo

@Dao
interface CarPlateDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addPlate(carInfo: CarInfo): Long

    @Query("SELECT * FROM car_info")
    suspend fun getAllPlates(): List<CarInfo>

    @Query("SELECT * FROM car_info WHERE id = :plateNumber")
    suspend fun getPlate(plateNumber: String): CarInfo

    @Query("DELETE FROM car_info WHERE id = :id")
    suspend fun deletePlate(id: Long)
}