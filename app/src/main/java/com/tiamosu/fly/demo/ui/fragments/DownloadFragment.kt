package com.tiamosu.fly.demo.ui.fragments

import android.util.Log
import androidx.lifecycle.observe
import com.tiamosu.fly.core.base.BaseFragment
import com.tiamosu.fly.core.utils.lazyViewModel
import com.tiamosu.fly.demo.R
import com.tiamosu.fly.demo.bridge.DownloadViewModel
import kotlinx.android.synthetic.main.fragment_download.*

/**
 * @author tiamosu
 * @date 2020/3/19.
 */
class DownloadFragment : BaseFragment() {
    private val viewModel: DownloadViewModel by lazyViewModel()

    override fun getLayoutId() = R.layout.fragment_download

    override fun initEvent() {
        btn_download_file.setOnClickListener {
            viewModel.downloadFile()
        }

        viewModel.fileLiveData.observe(viewLifecycleOwner, {
            Log.e("xia", "path:" + it.body?.absolutePath)
        })
        viewModel.progressLiveData.observe(viewLifecycleOwner, {
            progress_bar.progress = it.fraction * 100
            Log.e("xia", "fraction:" + it.fraction)
            if (it.fraction.toInt() == 1) {
                showToastInfo("下载成功~")
            }
        })
    }

    override fun doBusiness() {}
}