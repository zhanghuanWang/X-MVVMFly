package com.tiamosu.fly.base.dialog

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.Window
import com.blankj.utilcode.util.ActivityUtils
import com.blankj.utilcode.util.Utils

/**
 * @author tiamosu
 * @date 2020/2/19.
 */
abstract class BaseFlyDialog @JvmOverloads constructor(
    context: Context,
    themeResId: Int = 0
) : Dialog(context, themeResId) {

    @Suppress("MemberVisibilityCanBePrivate")
    protected var mActivity: Activity

    protected abstract fun bindLayout(): Int
    protected abstract fun initView(dialog: BaseFlyDialog, contentView: View)
    protected abstract fun setWindowStyle(window: Window?)

    init {
        val activity = ActivityUtils.getActivityByContext(context)
            ?: throw IllegalArgumentException("context is not instance of Activity.")
        mActivity = activity
    }

    override fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        val contentView = View.inflate(mActivity, bindLayout(), null)
        setContentView(contentView)
        initView(this, contentView)
        setWindowStyle(window)
    }

    override fun show() {
        Utils.runOnUiThread {
            if (ActivityUtils.isActivityAlive(context)) {
                super@BaseFlyDialog.show()
            }
        }
    }

    override fun dismiss() {
        Utils.runOnUiThread {
            if (ActivityUtils.isActivityAlive(context)) {
                super@BaseFlyDialog.dismiss()
            }
        }
    }
}