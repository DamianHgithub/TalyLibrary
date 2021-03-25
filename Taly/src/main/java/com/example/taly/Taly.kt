package com.example.taly

import android.util.Log

object Taly {
    private const val TAG = "LOGTALY"
    fun m(m: String) {
        Log.d(TAG, m)
    }
    fun m(t: Throwable) {
        Log.d(TAG, t.toString())
    }
    fun m(i: Int) {
        Log.d(TAG, i.toString())
    }
    fun m(l: Long) {
        Log.d(TAG, l.toString())
    }
    fun m(a: Any) {
        Log.d(TAG, a.toString())
    }
}