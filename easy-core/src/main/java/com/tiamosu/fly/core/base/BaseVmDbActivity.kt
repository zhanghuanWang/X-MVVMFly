package com.tiamosu.fly.core.base

import androidx.core.util.forEach
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * @author tiamosu
 * @date 2020/3/26.
 */
abstract class BaseVmDbActivity : BaseActivity() {

    protected abstract fun getDataBindingConfig(): DataBindingConfig

    override fun setContentView() {
        if (getLayoutId() > 0) {
            val dataBindingConfig = getDataBindingConfig()
            val dataBinding: ViewDataBinding = DataBindingUtil.setContentView(this, getLayoutId())
            dataBinding.lifecycleOwner = this
            val bindingParams = dataBindingConfig.getBindingParams()
            bindingParams.forEach { key, value ->
                dataBinding.setVariable(key, value)
            }
            rootView = dataBinding.root
        }
    }
}