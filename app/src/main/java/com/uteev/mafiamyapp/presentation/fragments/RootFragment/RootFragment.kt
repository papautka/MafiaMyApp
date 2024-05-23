package com.uteev.mafiamyapp.presentation.fragments.RootFragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.uteev.mafiamyapp.R
import com.uteev.mafiamyapp.databinding.FragmentRootBinding

class RootFragment : Fragment() {

    private var ctx : Context? = null
    private lateinit var binding : FragmentRootBinding

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
        with(binding) {
            rootVP2.adapter = ViewPagerAdapter(ctx as FragmentActivity)
            rootTL.tabIconTint = null
            TabLayoutMediator(rootTL, rootVP2) { tab, position ->
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
}