package com.tiamosu.fly.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import androidx.annotation.CallSuper
import com.tiamosu.fly.http.manager.NetworkDelegate
import me.yokeyword.fragmentation.SupportFragment
import java.lang.ref.WeakReference

/**
 * @author tiamosu
 * @date 2020/2/18.
 */
@Suppress("MemberVisibilityCanBePrivate")
abstract class BaseFlyFragment : SupportFragment(), IBaseView {
    var inflater: LayoutInflater? = null
    var rootView: View? = null

    private val networkDelegate by lazy { NetworkDelegate() }

    //保证转场动画的流畅性
    private var isonLazyInitView = false
    private var isOnEnterAnimationEnd = false

    @Suppress("UNCHECKED_CAST")
    fun <T : SupportFragment> getParentDelegate(): T {
        return (parentFragment ?: this) as T
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        this.inflater = inflater
        if (rootView == null) {
            setContentView()
        } else {
            // 缓存的 rootView 需要判断是否已经被加过 parent，如果有 parent 需要从 parent 删除，
            // 要不然会发生这个 rootview 已经有 parent 的错误。
            var viewParent: ViewParent
            if (rootView!!.parent.also { viewParent = it } is ViewGroup) {
                (viewParent as ViewGroup).removeView(rootView)
            }
        }
        return rootView
    }

    override fun setContentView() {
        if (getLayoutId() > 0) {
            val view = inflater?.inflate(getLayoutId(), null)
            val weakReferenceRootView = WeakReference(view)
            rootView = weakReferenceRootView.get()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initAny(savedInstanceState)
    }

    @CallSuper
    override fun initAny(savedInstanceState: Bundle?) {
        initData(arguments)
        initView(savedInstanceState, rootView)
        initEvent()

        //添加网络状态监听
        networkDelegate.addNetworkObserve(this)
    }

    override fun onNetworkStateChanged(isAvailable: Boolean) {}
    override fun onNetReConnect() {}

    override fun onEnterAnimationEnd(savedInstanceState: Bundle?) {
        super.onEnterAnimationEnd(savedInstanceState)
        isOnEnterAnimationEnd = true
        if (isonLazyInitView) {
            doBusiness()
        }
    }

    override fun onLazyInitView(savedInstanceState: Bundle?) {
        super.onLazyInitView(savedInstanceState)
        isonLazyInitView = true
        if (isOnEnterAnimationEnd) {
            doBusiness()
        }
    }
}