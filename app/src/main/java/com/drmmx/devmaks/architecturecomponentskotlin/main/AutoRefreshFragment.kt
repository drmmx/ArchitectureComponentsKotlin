package com.drmmx.devmaks.architecturecomponentskotlin.main

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.drmmx.devmaks.architecturecomponentskotlin.R
import kotlinx.android.synthetic.main.fragment_auto_refresh.*

/**
 * Created by dev3rema
 */
class AutoRefreshFragment : Fragment() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_auto_refresh, container, false)

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        mainViewModel.firstName.observe(this, Observer {
            autoTextFirstName.text = it
        })

        mainViewModel.lastName.observe(this, Observer {
            autoTextLastName.text = it
        })

        return rootView
    }

}