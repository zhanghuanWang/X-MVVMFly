package com.tiamosu.fly.http.cache.stategy

import com.tiamosu.fly.http.cache.RxCache
import com.tiamosu.fly.http.cache.model.CacheResult
import io.reactivex.Observable

/**
 * 描述：先显示缓存，缓存不存在，再请求网络
 *
 * @author tiamosu
 * @date 2020/3/10.
 */
@Suppress("unused")
class FirstCacheStategy : BaseStrategy() {

    override fun <T> execute(
        rxCache: RxCache,
        cacheKey: String?,
        cacheTime: Long,
        source: Observable<T>
    ): Observable<CacheResult<T>> {
        val cache: Observable<CacheResult<T>> = loadCache(rxCache, cacheKey, cacheTime, true)
        val remote: Observable<CacheResult<T>> = loadRemote(rxCache, cacheKey, source, false)
        return cache.switchIfEmpty(remote)
    }
}