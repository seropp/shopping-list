package com.example.shopinglist.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.shopinglist.data.db.entities.ShoppingItem

@Dao
interface ShoppingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addShoppingItem(item: ShoppingItem)

    @Delete
    suspend fun deleteShoppingItem(item: ShoppingItem)

    @Query("SELECT * FROM shopping_table ORDER BY id ASC")
    fun getAllShoppingItems(): LiveData<List<ShoppingItem>>
}