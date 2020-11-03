package com.zvonimirplivelic.parkingzg.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zvonimirplivelic.parkingzg.R
import com.zvonimirplivelic.parkingzg.view.adapter.PlateListAdapter
import kotlinx.android.synthetic.main.fragment_plate_list.*

class PlatesFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_plate_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val plateListAdapter = PlateListAdapter()
        platesList.adapter = plateListAdapter
    }
}