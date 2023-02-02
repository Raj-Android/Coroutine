package com.example.coroutine

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.runBlocking

fun main()= runBlocking{

    println("Main is started")
    joinAll(
        async { coroutineOne() },
        async { coroutineTwo() }
    )
    println("MAin is ended")
}
suspend fun coroutineOne(){
    println("Coroutine one is started")
    delay(2000)
    println("Coroutine One is ended")
}
suspend fun coroutineTwo(){
    println("Coroutine two is started")
    delay(2000)
    println("Coroutine two is ended")
}