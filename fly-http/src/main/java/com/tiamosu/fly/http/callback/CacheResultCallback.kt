package com.tiamosu.fly.http.callback

import com.tiamosu.fly.http.cache.model.CacheResult

/**
 * 描述：返回字符串（缓存）
 *
 * @author tiamosu
 * @date 2020/3/12.
 */
abstract class CacheResultCallback<T> : AbsCallback<T>() {

    /**
     * 拿到响应后，将数据转换成需要的格式，子线程中执行，可以是耗时操作
     *
     * @param string 需要转换的对象
     * @return 转换后的结果
     * @throws Exception 转换过程发生的异常
     */
    @Throws(Throwable::class)
    abstract fun convertResponse(string: String?)

    /**
     * 对返回数据进行操作的回调，UI线程
     */
    open fun onSuccess(cacheResult: CacheResult<String>) {}
}