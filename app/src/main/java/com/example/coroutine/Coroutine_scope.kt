package com.example.coroutine

import kotlinx.coroutines.*

private val scope= CoroutineScope(Dispatchers.Default +CoroutineName("$100"))
fun main() {
    scope.launch(Dispatchers.IO + CoroutineName("C100")) {
        println("$this")

    }

}

