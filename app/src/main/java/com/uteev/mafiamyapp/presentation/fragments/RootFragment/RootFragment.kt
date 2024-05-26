package com.uteev.mafiamyapp.presentation.fragments.RootFragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.bumptech.glide.Glide
import com.google.android.material.tabs.TabLayoutMediator
import com.uteev.mafiamyapp.R
import com.uteev.mafiamyapp.databinding.FragmentRootBinding
import com.uteev.mafiamyapp.di.ContextModule
import com.uteev.mafiamyapp.di.DaggerApplicationComponent
import javax.inject.Inject

class RootFragment : Fragment() {

    private var ctx : Context? = null
    private lateinit var binding : FragmentRootBinding

    @Inject
    lateinit var viewModel: RFViewModel

    private val component by lazy {
        DaggerApplicationComponent.builder()
            .contextModule(ContextModule(ctx as FragmentActivity))
            .build()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ctx = context
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRootBinding.inflate(inflater)
        showGif()
        with(binding) {
            rootViewPager.adapter = ViewPagerAdapter(ctx as FragmentActivity)
            rTabLayout.tabIconTint = null
            TabLayoutMediator(rTabLayout, rootViewPager) { tab, position ->
                when(position) {
                    0 -> {
                        tab.text = "Weather"
                        tab.setIcon(R.drawable.baseline_cloud_queue_24)
                    }
                    1 -> {
                        tab.text = "Other"
                        tab.setIcon(R.drawable.baseline_cloud_queue_24)
                    }
                }
            }.attach()
        }

        return binding.root
    }

    private fun showGif() {
        val gifResource = R.drawable.ghibli_image
        Glide.with(this)
            .asGif()
            .load(gifResource)
            .into(binding.rootIV)
    }


}