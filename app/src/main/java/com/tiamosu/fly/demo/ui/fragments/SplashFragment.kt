package com.tiamosu.fly.demo.ui.fragments

import com.tiamosu.fly.core.base.BaseFragment
import com.tiamosu.fly.demo.R
import com.tiamosu.fly.demo.databinding.FragmentSplashBinding
import com.tiamosu.fly.ext.clickNoRepeat
import com.tiamosu.fly.ext.navigate

/**
 * @author tiamosu
 * @date 2020/3/13.
 */
class SplashFragment : BaseFragment() {
    private val dataBinding by lazy { binding as FragmentSplashBinding }

    override fun getLayoutId() = R.layout.fragment_splash

    override fun initEvent() {
        dataBinding.btnEnterMain.clickNoRepeat {
            navigate(R.id.action_to_mainFragment)
        }
    }

    override fun doBusiness() {}
}