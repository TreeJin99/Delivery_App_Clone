package com.example.delivery_app_clone.screen.main.home

import android.nfc.Tag
import com.example.delivery_app_clone.databinding.FragmentHomeBinding
import com.example.delivery_app_clone.screen.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>() {
    override val viewModel by viewModel<HomeViewModel>()

    override fun getViewBinding(): FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)

    override fun observeData() {

    }
    companion object{
        fun newInstance() = HomeFragment()
        const val TAG = "HOME FRAGMENT"
    }
}