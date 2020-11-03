package com.zvonimirplivelic.parkingzg.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.zvonimirplivelic.parkingzg.model.CarInfo

class PlateListViewModel (application: Application): AndroidViewModel(application){

    fun getPlateList(): LiveData<List<CarInfo>> {

    }
}