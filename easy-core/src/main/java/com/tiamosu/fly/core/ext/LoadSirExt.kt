package com.tiamosu.fly.core.ext

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import com.kingja.loadsir.core.LoadService
import com.kingja.loadsir.core.LoadSir
import com.tiamosu.fly.core.R
import com.tiamosu.fly.core.base.BaseActivity
import com.tiamosu.fly.core.base.BaseFragment
import com.tiamosu.fly.core.ui.loadsir.ErrorCallback

/**
 * @author tiamosu
 * @date 2020/4/11.
 */
fun BaseActivity.loadServiceInit(view: View, onCallback: () -> Unit): LoadService<*> {
    val loadService = LoadSir.getDefault().register(view) {
        //点击触发重试操作
        onCallback.invoke()
    }
    this.loadService = loadService
    showLoading()
    return loadService
}

fun BaseFragment.loadServiceInit(view: View, onCallback: () -> Unit): LoadService<*> {
    val loadService = LoadSir.getDefault().register(view) {
        //点击触发重试操作
        onCallback.invoke()
    }
    this.loadService = loadService
    showLoading()
    return loadService
}

fun LoadService<*>.setErrorText(error: String) {
    setCallBack(ErrorCallback::class.java) { _, view ->
        view.findViewById<AppCompatTextView>(R.id.error_text).text = error
    }
}