package com.example.delivery_app_clone.data.entity

import android.os.Parcelable
import com.example.delivery_app_clone.screen.main.home.restaurant.RestaurantCategory
import kotlinx.android.parcel.Parcelize


@Parcelize
data class RestaurantEntity(
    override val id: Long,
    val restaurantInfoId: Long,
    val restaurantTitle : String,
    val restaurantCategory: RestaurantCategory,
    val restaurantImageUrl: String,
    val grade: Float,
    val reviewCount: Int,
    val deliveryTimeRange: Pair<Int, Int>,
    val deliveryTipRange: Pair<Int, Int>
): Entity, Parcelable