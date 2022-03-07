package com.example.shopinglist.data.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_table")
class ShoppingItem(
    @ColumnInfo(name = "item_name") var itemName: String,
    @ColumnInfo(name = "item_amount") var amount: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
