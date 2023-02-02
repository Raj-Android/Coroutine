package com.example.coroutine

import kotlinx.coroutines.*

fun main() = runBlocking { // Creates a blocking coroutine that executes in current thread (main)

    println("Main program starts: ${Thread.currentThread().name}")  // main thread

    val job: Job = launch {     // Thread main: Creates a non-blocking coroutine
        for (i in 0..500) {
            print("$i.")         //it is not belong to kotlinx.coroutines package
          //Thread.sleep(50)  //it is not belong to kotlinx.coroutines package that way cancellation not work
         // delay(20)      // or use delay() or any other suspending function as per your need.
        }
    }

    delay(1000)  // Let's print a few values before we cancel
    job.cancel()                              //we combine line 18,19 e.g job.cancelAndJoin()
    //job.join() //wait for coroutine finish
    println("\nMain program ends: ${Thread.currentThread().name}")    // main thread
}