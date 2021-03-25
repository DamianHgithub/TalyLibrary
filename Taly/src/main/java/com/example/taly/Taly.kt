package com.example.taly

import android.util.Log

object Taly {
    object TalyLog {
        fun m(m: String) {
            showMessage(m)
        }
        fun m(t: Throwable) {
            showMessage(t.toString())
        }
        fun m(i: Int) {
            showMessage(i.toString())
        }
        fun m(l: Long) {
            showMessage(l.toString())
        }
        fun m(a: Any) {
            showMessage(a.toString())
        }
    }
    private var tag = "LOGTALY"
    fun m(m: String) {
        showMessage(m)
    }
    fun m(t: Throwable) {
        showMessage(t.toString())
    }
    fun m(i: Int) {
        showMessage(i.toString())
    }
    fun m(l: Long) {
        showMessage(l.toString())
    }
    fun m(a: Any) {
        showMessage(a.toString())
    }
    fun tag(tag: String): TalyLog {
        this.tag = tag
        return TalyLog
    }
    fun showMessage(message: String) {
        Log.d(tag, message)
        tag = "LOGTALY"
    }
}