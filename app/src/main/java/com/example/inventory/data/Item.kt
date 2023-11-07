
package com.example.inventory.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "items")
class Item(
    @PrimaryKey
    val id: Int = 0,
    val name: String,
    val price: Double,
    val quantity: Int
)
