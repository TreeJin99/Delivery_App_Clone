package com.example.delivery_app_clone.widget.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.delivery_app_clone.model.Model
import com.example.delivery_app_clone.screen.base.BaseViewModel
import com.example.delivery_app_clone.widget.adapter.listener.AdapterListener

abstract class ModelViewHolder<M : Model>(
    binding: ViewBinding,
    protected val viewModel: BaseViewModel,
    protected val resourcesProvider: com.example.delivery_app_clone.common.util.provider.ResourcesProvider
) : RecyclerView.ViewHolder(binding.root) {

    abstract fun reset()

    open fun bindData(model: M){
        reset()
    }

    abstract fun bindViews(model: M, adapterListener: AdapterListener)

}