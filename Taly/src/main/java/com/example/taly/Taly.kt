package com.example.taly

import android.util.Log

object Taly {
    private var tag = "LOGTALY"
    fun m(s: String) {
        showMessage(s)
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
    fun tag(tag: String): LogTaly {
        this.tag = tag
        return LogTaly
    }
    private fun showMessage(message: String) {
        Log.d(tag, message)
        tag = "LOGTALY"
    }
    object LogTaly {
        fun m(s: String) {
            showMessage(s)
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
}