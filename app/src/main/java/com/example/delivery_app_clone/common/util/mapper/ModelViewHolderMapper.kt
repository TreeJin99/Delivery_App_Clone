package com.example.delivery_app_clone.common.util.mapper

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.delivery_app_clone.common.util.provider.ResourceProvider
import com.example.delivery_app_clone.databinding.ViewholderEmptyBinding
import com.example.delivery_app_clone.model.CellType
import com.example.delivery_app_clone.model.Model
import com.example.delivery_app_clone.screen.base.BaseViewModel
import com.example.delivery_app_clone.widget.adapter.viewholder.EmptyViewHolder
import com.example.delivery_app_clone.widget.adapter.viewholder.ModelViewHolder

object ModelViewHolderMapper {

    @Suppress("UNCHECKED_CAST")
    fun <M : Model> map(
        parent: ViewGroup,
        type: CellType,
        viewModel: BaseViewModel,
        resourcesProvider: ResourceProvider
    ): ModelViewHolder<M> {
        val inflater = LayoutInflater.from(parent.context)

        val viewHolder = when (type) {
            CellType.EMPTY_CELL -> {
                EmptyViewHolder(
                    ViewholderEmptyBinding.inflate(inflater, parent, false),
                    viewModel,
                    resourcesProvider
                )
            }
        }
        return viewHolder as ModelViewHolder<M>
    }
}