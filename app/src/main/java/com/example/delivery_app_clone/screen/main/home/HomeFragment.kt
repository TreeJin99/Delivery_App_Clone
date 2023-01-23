package com.example.delivery_app_clone.screen.main.home

import androidx.viewpager.widget.PagerAdapter
import com.example.delivery_app_clone.databinding.FragmentHomeBinding
import com.example.delivery_app_clone.screen.base.BaseFragment
import com.example.delivery_app_clone.screen.main.home.restaurant.RestaurantCategory
import com.example.delivery_app_clone.screen.main.home.restaurant.RestaurantListFragment
import com.example.delivery_app_clone.widget.adapter.RestaurantListFragmentPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>() {
    override val viewModel by viewModel<HomeViewModel>()

    override fun getViewBinding(): FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)

    private lateinit var viewPagerAdapter: RestaurantListFragmentPagerAdapter

    override fun initViews() {
        super.initViews()
        initViewPager()
    }

    private fun initViewPager() = with(binding) {
        val restaurantCategories = RestaurantCategory.values()

        if (::viewPagerAdapter.isInitialized.not()) {
            val restaurantListFragmentList = restaurantCategories.map {
                RestaurantListFragment.newInstance(it)
            }

            viewPagerAdapter = RestaurantListFragmentPagerAdapter(
                this@HomeFragment,
                restaurantListFragmentList
            )
        }
        viewPager.adapter = viewPagerAdapter

        viewPager.offscreenPageLimit = restaurantCategories.size
        TabLayoutMediator(tableLayout, viewPager) { tab, position ->
            tab.setText(restaurantCategories[position].categoryNameId)
        }.attach()
    }

    override fun observeData() {

    }

    companion object {
        fun newInstance() = HomeFragment()
        const val TAG = "HOME FRAGMENT"
    }
}