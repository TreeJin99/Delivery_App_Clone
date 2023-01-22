package com.example.delivery_app_clone.common.util.provider

import android.content.res.ColorStateList
import androidx.annotation.ColorRes
import androidx.annotation.StringRes

interface ResourceProvider {
    fun getString(@StringRes resId: Int): String

    fun getString(@StringRes resId: Int, vararg formArgs : Any): String

    fun getColor(@ColorRes resId: Int) : Int

    fun getColorStateList(@ColorRes resId: Int) : ColorStateList

}