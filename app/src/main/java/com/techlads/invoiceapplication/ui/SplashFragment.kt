package com.techlads.invoiceapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.techlads.invoiceapplication.R
import com.techlads.invoiceapplication.databinding.FragmentSplashBinding



class SplashFragment : BaseFragment<FragmentSplashBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSplashBinding {
        return FragmentSplashBinding.inflate(inflater, container, false)
    }

    override fun onPostInit() {
        binding.goToMainFragment.setOnClickListener {
            findNavController().navigate(R.id.action_splashFragment_to_HomeFragment)
        }
    }


}