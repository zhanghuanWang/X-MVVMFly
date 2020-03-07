package com.tiamosu.fly.http.request

import com.tiamosu.fly.http.request.base.BaseBodyRequest
import io.reactivex.Observable
import okhttp3.RequestBody
import okhttp3.Response

/**
 * @author tiamosu
 * @date 2020/3/6.
 */
class DeleteRequest<T>(url: String) : BaseBodyRequest<T, DeleteRequest<T>>(url) {

    override fun generateRequest(): Observable<Response>? {
        when {
            requestBody != null -> {
                return apiService?.deleteBody(url, requestBody!!)
            }
            json != null -> {
                val body = RequestBody.create(mediaType, json!!)
                return apiService?.deleteJson(url, body)
            }
            content != null -> {
                val body = RequestBody.create(mediaType, content!!)
                return apiService?.deleteBody(url, body)
            }
            bytes != null -> {
                val body = RequestBody.create(mediaType, bytes!!)
                return apiService?.deleteBody(url, body)
            }
            any != null -> {
                return apiService?.deleteBody(url, any!!)
            }
            else -> return apiService?.delete(url, httpParams.urlParamsMap)
        }
    }
}