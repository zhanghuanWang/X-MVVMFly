package com.tiamosu.fly.fragmentation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import com.tiamosu.fly.navigation.NavHostFragment

/**
 * @author tiamosu
 * @date 2020/4/15.
 */
object FlySupportHelper {

    fun getAddedFragment(fragmentManager: FragmentManager): IFlySupportFragment? {
        return getAddedFragment(fragmentManager, null)
    }

    private fun getAddedFragment(
        fragmentManager: FragmentManager,
        parentFragment: IFlySupportFragment?
    ): IFlySupportFragment? {
        val fragmentList = getAddedFragments(fragmentManager)
        if (fragmentList.isEmpty()) {
            return parentFragment
        }
        for (i in fragmentList.indices.reversed()) {
            val fragment = fragmentList[i]
            if ((fragment is IFlySupportFragment || fragment is NavHostFragment)
                && fragment.isResumed && isFragmentVisible(fragment)
            ) {
                return getAddedFragment(
                    fragment.childFragmentManager,
                    fragment as? IFlySupportFragment
                )
            }
        }
        return parentFragment
    }

    @Suppress("DEPRECATION")
    fun isFragmentVisible(fragment: Fragment): Boolean {
        return fragment.lifecycle.currentState == Lifecycle.State.STARTED
    }

    fun getAddedFragments(fragmentManager: FragmentManager): List<Fragment> {
        return fragmentManager.fragments
    }
}