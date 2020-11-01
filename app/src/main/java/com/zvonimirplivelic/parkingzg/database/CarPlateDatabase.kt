package com.zvonimirplivelic.parkingzg.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.zvonimirplivelic.parkingzg.model.CarPlate
import com.zvonimirplivelic.parkingzg.model.PaidTicket

@Database(entities = [CarPlate::class, PaidTicket::class], version = 1, exportSchema = false)
abstract class CarPlateDatabase : RoomDatabase() {
    abstract fun carPlateDao(): CarPlateDao

    companion object {
        @Volatile
        private var instance: CarPlateDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            CarPlateDatabase::class.java,
            "car_plate_database"
        ).build()
    }
}