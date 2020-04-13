package com.tiamosu.fly.module.main.ui.fragments

import com.tiamosu.fly.module.common.base.BaseFragment
import com.tiamosu.fly.module.common.utils.lazyViewModel
import com.tiamosu.fly.module.main.R
import com.tiamosu.fly.module.main.bridge.UploadViewModel
import kotlinx.android.synthetic.main.fragment_upload.*

/**
 * @author tiamosu
 * @date 2020/3/19.
 */
class UploadFragment : BaseFragment() {
    private val viewModel: UploadViewModel by lazyViewModel()

    override fun getLayoutId() = R.layout.fragment_upload

    override fun initEvent() {
        btn_upload_file.setOnClickListener {
            viewModel.uploadFile()
        }
    }

    override fun doBusiness() {}
}