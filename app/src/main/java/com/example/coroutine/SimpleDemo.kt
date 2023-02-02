package com.example.coroutine

fun main() {

    routineOne()
    routineTwo()
}

fun routineOne(){
    println("Routine one is started")
    Thread.sleep(3000)
    //delay(3000)
    // Here we don't write delay() because is Suspend function 'delay' should be called only from a coroutine or another suspend function
    println("Routine One is ended")

}
fun routineTwo(){
    println("Routine two is started")
    Thread.sleep(2000)
    println("Routine two is ended")

}