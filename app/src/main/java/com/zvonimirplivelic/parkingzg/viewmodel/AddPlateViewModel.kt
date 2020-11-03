package com.zvonimirplivelic.parkingzg.viewmodel

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.zvonimirplivelic.parkingzg.database.CarPlateDatabase
import com.zvonimirplivelic.parkingzg.model.CarInfo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AddPlateViewModel(application: Application) : AndroidViewModel(application) {

    private val coroutineScope = CoroutineScope(Dispatchers.IO)
    private val database by lazy { CarPlateDatabase(getApplication()).carPlateDao() }


    fun addPlateToDatabase(plateNumber: String, carManufacturer: String, carModel: String) {
        coroutineScope.launch {
            val car = database.getPlate(plateNumber)

            withContext(Dispatchers.Main) {
                val carInfo = CarInfo(plateNumber, carManufacturer, carModel)
                database.addPlate(carInfo)
            }
        }
    }
}
