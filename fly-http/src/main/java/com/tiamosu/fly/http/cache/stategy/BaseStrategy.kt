package com.tiamosu.fly.http.cache.stategy

import com.tiamosu.fly.http.cache.RxCache
import com.tiamosu.fly.http.cache.model.CacheResult
import com.tiamosu.fly.http.utils.iLog
import io.reactivex.Observable
import io.reactivex.ObservableSource
import io.reactivex.functions.Function

/**
 * 描述：实现缓存策略的基类
 *
 * @author tiamosu
 * @date 2020/3/10.
 */
abstract class BaseStrategy : IStrategy {

    fun <T> loadCache(
        rxCache: RxCache,
        key: String?,
        time: Long,
        needEmpty: Boolean
    ): Observable<CacheResult<T>> {
        var observable = rxCache.load<T>(key, time)
            .flatMap { t ->
                if (t == null) {
                    Observable.error(NullPointerException("Not find the cache!"))
                } else Observable.just(CacheResult<T>(true, t))
            }
        if (needEmpty) {
            observable = observable
                .onErrorResumeNext(Function<Throwable, ObservableSource<out CacheResult<T>>> { Observable.empty() })
        }
        return observable
    }

    //请求成功后：同步保存
    fun <T> loadRemote(
        rxCache: RxCache,
        key: String?,
        source: Observable<T>,
        needEmpty: Boolean
    ): Observable<CacheResult<T>> {
        var observable = source
            .flatMap { t ->
                rxCache.save(key, t).map { boolean ->
                        iLog("save status => $boolean")
                        CacheResult<T>(false, t)
                    }
                    .onErrorReturn { throwable ->
                        iLog("save status => $throwable")
                        CacheResult(false, t)
                    }
            }
        if (needEmpty) {
            observable = observable
                .onErrorResumeNext(Function<Throwable, ObservableSource<out CacheResult<T>>> { Observable.empty() })
        }
        return observable
    }
}