package com.example.delivery_app_clone.widget.adapter.viewholder

import com.example.delivery_app_clone.common.util.provider.ResourcesProvider
import com.example.delivery_app_clone.databinding.ViewholderEmptyBinding
import com.example.delivery_app_clone.model.Model
import com.example.delivery_app_clone.screen.base.BaseViewModel
import com.example.delivery_app_clone.widget.adapter.listener.AdapterListener

class EmptyViewHolder(
    private val binding: ViewholderEmptyBinding,
    viewModel: BaseViewModel,
    resourcesProvider: ResourcesProvider
) : ModelViewHolder<Model>(binding, viewModel, resourcesProvider) {
    override fun reset() = Unit

    override fun bindViews(model: Model, adapterListener: AdapterListener) = Unit
}