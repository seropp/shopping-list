package com.example.shopinglist.data.repositories

import androidx.lifecycle.LiveData
import com.example.shopinglist.data.db.ShoppingDatabase
import com.example.shopinglist.data.db.entities.ShoppingItem

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    suspend fun addShoppingItem(item: ShoppingItem) = db.getShoppingDao().addShoppingItem(item)

    suspend fun deleteShoppingItem(item: ShoppingItem) = db.getShoppingDao().deleteShoppingItem(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}