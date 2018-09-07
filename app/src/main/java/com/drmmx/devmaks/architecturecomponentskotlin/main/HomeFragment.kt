package com.drmmx.devmaks.architecturecomponentskotlin.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log.d
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.drmmx.devmaks.architecturecomponentskotlin.R
import kotlinx.android.synthetic.main.fragment_home.view.*

/**
 * Created by dev3rema
 */
class HomeFragment : Fragment() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        rootView.saveButton.setOnClickListener {
            mainViewModel.firstName.value = rootView.yourFirstNameEdit.text.toString()
            mainViewModel.lastName.value = rootView.yourLastNameEdit.text.toString()
            d("maks_", rootView.yourFirstNameEdit.text.toString())
            d("maks_", rootView.yourLastNameEdit.text.toString())
        }

        return rootView
    }

}