package com.example.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(){

}

fun create10kCoroutine()= runBlocking{
    var a=1
    val duration= measureTimeMillis {
        repeat(100_000){
            launch{
                delay(100)
                println("Rajesh kumar :"+ a++)
            }
        }

    }
    println("Time=${(duration/1000)} seconds")
}

fun create10kThread(){
    var a=0
    val duration= measureTimeMillis {
        repeat(100_00){
            Thread.sleep(100)
            println("Rajesh Kumar :"+ a++)
        }

    }
    println("Time=${(duration/1000)} second")

}