package com.tiamosu.fly.http.cache.stategy

import com.tiamosu.fly.http.cache.RxCache
import com.tiamosu.fly.http.cache.model.CacheResult
import io.reactivex.Observable

/**
 * 描述：仅加载网络，但数据依然会被缓存
 *
 * @author tiamosu
 * @date 2020/3/10.
 */
@Suppress("unused")
class OnlyRemoteStrategy : BaseStrategy() {

    override fun <T> execute(
        rxCache: RxCache,
        cacheKey: String?,
        cacheTime: Long,
        source: Observable<T>
    ): Observable<CacheResult<T>> {
        return loadRemote(rxCache, cacheKey, source, false)
    }
}