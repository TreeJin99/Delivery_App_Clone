package com.example.delivery_app_clone.screen.main.home.restaurant

import android.util.Log
import androidx.core.os.bundleOf
import com.example.delivery_app_clone.databinding.FragmentRestaurantListBinding
import com.example.delivery_app_clone.screen.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class RestaurantListFragment : BaseFragment<RestaurantListViewModel, FragmentRestaurantListBinding>() {

    private val restaurantCategory by lazy {
        arguments?.getSerializable(RESTAURANT_CATEGORY_KEY) as RestaurantCategory
    }

    override val viewModel by viewModel<RestaurantListViewModel>() {
        parametersOf(restaurantCategory)
    }

//    override val viewModel: RestaurantListViewModel by viewModel { parametersOf(restaurantCategory) }()

    override fun getViewBinding(): FragmentRestaurantListBinding = FragmentRestaurantListBinding.inflate(layoutInflater)

    override fun observeData() = viewModel.restaurantListLiveData.observe(viewLifecycleOwner) {
        Log.e("Restaurant List", it.toString())
    }

    companion object {
        const val RESTAURANT_CATEGORY_KEY = "restaurantCategory"

        fun newInstance(restaurantCategory: RestaurantCategory): RestaurantListFragment {
            return RestaurantListFragment().apply {
                arguments = bundleOf(
                    RESTAURANT_CATEGORY_KEY to restaurantCategory
                )
            }
        }
    }
}