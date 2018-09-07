package com.drmmx.devmaks.architecturecomponentskotlin.main

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData

/**
 * Created by dev3rema
 */
class MainViewModel(application: Application) : AndroidViewModel(application) {
    val firstName : MutableLiveData<String> = MutableLiveData()
    val lastName : MutableLiveData<String> = MutableLiveData()
}