package com.example.delivery_app_clone.data.repository

import com.example.delivery_app_clone.data.entity.RestaurantEntity
import com.example.delivery_app_clone.screen.main.home.restaurant.RestaurantCategory

interface RestaurantRepository {
    suspend fun getList(
        restaurantCategory: RestaurantCategory,
    ): List<RestaurantEntity>
}