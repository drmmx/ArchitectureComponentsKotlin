package com.drmmx.devmaks.architecturecomponentskotlin.database

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by dev3rema
 */
@Entity(tableName = "user")
data class User(@PrimaryKey(autoGenerate = true) var firstName: String, var lastName: String)
