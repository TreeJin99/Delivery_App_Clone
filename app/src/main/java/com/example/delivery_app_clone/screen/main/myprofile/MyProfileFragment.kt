package com.example.delivery_app_clone.screen.main.myprofile

import com.example.delivery_app_clone.databinding.FragmentMyprofileBinding
import com.example.delivery_app_clone.screen.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class MyProfileFragment : BaseFragment<MyProfileViewModel, FragmentMyprofileBinding>() {
    override val viewModel by viewModel<MyProfileViewModel>()

    override fun getViewBinding(): FragmentMyprofileBinding = FragmentMyprofileBinding.inflate(layoutInflater)

    override fun observeData() {
    }

    companion object{
        fun newInstance() = MyProfileFragment()
        const val TAG = "MyProfile FRAGMENT"
    }
}