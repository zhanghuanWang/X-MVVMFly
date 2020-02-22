package com.tiamosu.fly.demo.base

import android.util.Log
import com.tiamosu.fly.base.BaseFlyActivity

/**
 * @author tiamosu
 * @date 2020/2/22.
 */
abstract class BaseActivity : BaseFlyActivity() {

    override fun onNetworkStateChanged(isAvailable: Boolean) {
        Log.e("xia", "页面====：${javaClass.simpleName}   网络状态=====：$isAvailable")
    }

    override fun onNetReConnect() {
        Log.e("xia", "页面====：${javaClass.simpleName}   进行重新连接")
    }
}