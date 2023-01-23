package com.example.delivery_app_clone.di

import com.example.delivery_app_clone.common.util.provider.DefaultResourcesProvider
import com.example.delivery_app_clone.common.util.provider.ResourcesProvider
import com.example.delivery_app_clone.data.repository.DefaultRestaurantRepository
import com.example.delivery_app_clone.data.repository.RestaurantRepository
import com.example.delivery_app_clone.screen.main.home.HomeViewModel
import com.example.delivery_app_clone.screen.main.home.restaurant.RestaurantCategory
import com.example.delivery_app_clone.screen.main.home.restaurant.RestaurantListViewModel
import com.example.delivery_app_clone.screen.main.myprofile.MyProfileViewModel
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { HomeViewModel() }
    viewModel { MyProfileViewModel() }
    viewModel { (restaurantCategory: RestaurantCategory) -> RestaurantListViewModel(restaurantCategory, get()) }

    single<RestaurantRepository> { DefaultRestaurantRepository(get()) }

    single { provideGsonConvertFactory() }
    single { buildOkHttpClient() }

    single { provideRetrofit(get(), get()) }

    single<ResourcesProvider> { DefaultResourcesProvider(androidApplication()) }

    single { Dispatchers.IO }
    single { Dispatchers.Main }
}