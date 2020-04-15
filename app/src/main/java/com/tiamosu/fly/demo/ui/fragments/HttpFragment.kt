package com.tiamosu.fly.demo.ui.fragments

import com.tiamosu.fly.core.base.BaseFragment
import com.tiamosu.fly.demo.R
import com.tiamosu.fly.integration.ext.navigate
import kotlinx.android.synthetic.main.fragment_http.*

/**
 * @author tiamosu
 * @date 2020/3/19.
 */
class HttpFragment : BaseFragment() {

    override fun getLayoutId() = R.layout.fragment_http

    override fun initEvent() {
        btn_basic_request.setOnClickListener {
            navigate(R.id.action_httpFragment_to_basicRequestFragment)
        }
        btn_upload.setOnClickListener {
            navigate(R.id.action_httpFragment_to_uploadFragment)
        }
        btn_download.setOnClickListener {
            navigate(R.id.action_httpFragment_to_downloadFragment)
        }
        btn_request_cache.setOnClickListener {
            navigate(R.id.action_httpFragment_to_cacheFragment)
        }
    }

    override fun doBusiness() {}
}