package com.example.taly

import android.util.Log

object Taly {
    private var tag = "LOGTALY"
    fun m(m: String) {
        Log.d(tag, m)
    }
    fun m(t: Throwable) {
        Log.d(tag, t.toString())
    }
    fun m(i: Int) {
        Log.d(tag, i.toString())
    }
    fun m(l: Long) {
        Log.d(tag, l.toString())
    }
    fun m(a: Any) {
        Log.d(tag, a.toString())
    }
    fun tag(tag: String): Taly {
        this.tag = tag
        return Taly
    }
}