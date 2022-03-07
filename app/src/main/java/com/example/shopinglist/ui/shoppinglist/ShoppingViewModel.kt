package com.example.shopinglist.ui.shoppinglist

import androidx.lifecycle.ViewModel
import com.example.shopinglist.data.db.entities.ShoppingItem
import com.example.shopinglist.data.repositories.ShoppingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.coroutines.coroutineContext

class ShoppingViewModel(
    private val repository: ShoppingRepository
) : ViewModel() {

    fun upsert(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.addShoppingItem(item)
    }

    fun delete(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.deleteShoppingItem(item)
    }

    fun getAllShoppingItems() = repository.getAllShoppingItems()
}