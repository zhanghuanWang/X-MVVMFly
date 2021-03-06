package com.tiamosu.fly.demo.ext

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

/**
 * ViewPager2 初始化
 */
fun ViewPager2.init(
    fragment: Fragment,
    fragments: ArrayList<Class<out Fragment>>,
    isUserInputEnabled: Boolean = true,
    offscreenPageLimit: Int = fragments.size
): ViewPager2 {
    //是否可滑动
    this.isUserInputEnabled = isUserInputEnabled
    this.offscreenPageLimit = offscreenPageLimit
    //设置适配器
    adapter = object : FragmentStateAdapter(fragment) {
        override fun createFragment(position: Int) = fragments[position].newInstance()
        override fun getItemCount() = fragments.size
    }
    return this
}