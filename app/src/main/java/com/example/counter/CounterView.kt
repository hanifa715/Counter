package com.example.counter

interface CounterView {
    fun showCounter(count: Int)
    fun changeColor(color: Int)
    fun showToast(msg: String)
}