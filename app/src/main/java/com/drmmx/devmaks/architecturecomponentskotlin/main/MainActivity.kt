package com.drmmx.devmaks.architecturecomponentskotlin.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.view.MenuItem
import com.drmmx.devmaks.architecturecomponentskotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        loadFragment(HomeFragment())

        bottomNavigationView.setOnNavigationItemSelectedListener(this)

    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.container, fragment)
                .commit()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.homeItem -> loadFragment(HomeFragment())
            R.id.firstItem -> loadFragment(AutoRefreshFragment())
            R.id.secondItem -> loadFragment(ButtonRefreshFragment())
        }
        return true
    }
}
