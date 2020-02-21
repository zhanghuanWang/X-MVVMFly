package com.tiamosu.fly.base

import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import androidx.annotation.NonNull
import com.tiamosu.fly.R
import com.tiamosu.fly.utils.FragmentUtils
import com.tiamosu.fly.utils.Preconditions
import me.yokeyword.fragmentation.ISupportFragment

/**
 * @author tiamosu
 * @date 2020/2/18.
 */
abstract class BaseProxyActivity : BaseFlyActivity() {

    /**
     * @return 设置根Fragment
     */
    @NonNull
    protected abstract fun getRootFragment(): Class<out ISupportFragment>

    override fun setContentView() {
        if (getLayoutId() <= 0) {
            rootView = FrameLayout(this)
            rootView!!.id = R.id.delegate_container
            setContentView(rootView)
        } else {
            super.setContentView()
        }

        loadRootFragment(R.id.delegate_container)
    }

    protected open fun loadRootFragment(containerId: Int) {
        if (getLayoutId() > 0 && containerId == R.id.delegate_container) {
            Preconditions.checkArgument(
                false,
                "you should override loadRootFragment(containerId)!"
            )
        }
        if (findFragment(getRootFragment()) == null) {
            loadRootFragment(containerId, FragmentUtils.newInstance(getRootFragment()))
        }
    }

    override fun getLayoutId(): Int {
        return 0
    }

    override fun initData(bundle: Bundle?) {}
    override fun initView(savedInstanceState: Bundle?, contentView: View?) {}
    override fun initEvent() {}
    override fun doBusiness() {}
}