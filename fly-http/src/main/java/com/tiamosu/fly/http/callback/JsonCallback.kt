package com.tiamosu.fly.http.callback

import com.tiamosu.fly.utils.Platform
import io.reactivex.functions.Action
import java.lang.reflect.ParameterizedType

/**
 * @author tiamosu
 * @date 2020/3/8.
 */
abstract class JsonCallback<T>(private val serializator: IGenericsSerializator) :
    CacheResultCallback<T>() {

    @Suppress("UNCHECKED_CAST")
    override fun convertResponse(string: String?) {
        var result: T? = null
        string?.let {
            var type = javaClass.genericSuperclass
            if (type is ParameterizedType) {
                type = type.actualTypeArguments[0]
            }
            if (type is Class<*>) {
                result = when (type) {
                    String::class.java -> it as? T
                    else -> serializator.transform(it, type) as? T
                }
            }
        }
        Platform.postOnMain(Action {
            onSuccess(result)
        })
    }
}
