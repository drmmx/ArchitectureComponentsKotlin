package com.drmmx.devmaks.architecturecomponentskotlin.main

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.drmmx.devmaks.architecturecomponentskotlin.R
import kotlinx.android.synthetic.main.fragment_button_refresh.*
import kotlinx.android.synthetic.main.fragment_button_refresh.view.*

/**
 * Created by dev3rema
 */
class ButtonRefreshFragment : Fragment() {
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_button_refresh, container, false)

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        rootView.buttonRefresh.setOnClickListener {
            mainViewModel.firstName.observe(this, Observer {
                refreshTextFirstName.text = it
            })

            mainViewModel.lastName.observe(this, Observer {
                refreshTextLastName.text = it
            })
        }

        return rootView
    }

}