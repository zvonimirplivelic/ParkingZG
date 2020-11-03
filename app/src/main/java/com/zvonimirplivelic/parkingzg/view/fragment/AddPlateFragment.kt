package com.zvonimirplivelic.parkingzg.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.zvonimirplivelic.parkingzg.R
import com.zvonimirplivelic.parkingzg.model.CarInfo
import com.zvonimirplivelic.parkingzg.viewmodel.AddPlateViewModel
import kotlinx.android.synthetic.main.fragment_add_plate.*


class AddPlateFragment : Fragment() {

    private lateinit var viewModel: AddPlateViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_add_plate, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnAddPlate.setOnClickListener { addPlate(it) }

        viewModel = ViewModelProviders.of(this).get(AddPlateViewModel::class.java)
    }

    private fun addPlate(v: View) {
        val plateNumber = etPlateNumber.text.toString()
        val carManufacturer = etCarManufacturer.text.toString()
        val carModel = etCarModel.text.toString()

        if (plateNumber.isNullOrEmpty() ||
            carManufacturer.isNullOrEmpty() ||
            carModel.isNullOrEmpty()
        ) {
            Toast.makeText(activity, "Molimo vas da popunite sva polja!!!", Toast.LENGTH_SHORT).show()
        } else {
            viewModel.addPlateToDatabase(plateNumber, carManufacturer, carModel)

            val action = AddPlateFragmentDirections.actionAddPlateFragmentToPlatesFragment()
            Navigation.findNavController(btnAddPlate).navigate(action)
        }
    }
}