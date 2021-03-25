package com.example.taly

import android.util.Log

object Taly {
    interface TALY_INTERFACE {
        fun m(m: String)
        fun m(t: Throwable)
        fun m(i: Int)
        fun m(l: Long)
        fun m(a: Any)
    }
    private val TalyLog: TALY_INTERFACE = object: TALY_INTERFACE {
        override fun m(m: String) {
            showMessage(m)
        }
        override fun m(t: Throwable) {
            showMessage(t.toString())
        }
        override fun m(i: Int) {
            showMessage(i.toString())
        }
        override fun m(l: Long) {
            showMessage(l.toString())
        }
        override fun m(a: Any) {
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
    fun tag(tag: String): TALY_INTERFACE {
        this.tag = tag
        return TalyLog
    }
    fun showMessage(message: String) {
        Log.d(tag, message)
        tag = "LOGTALY"
    }
}