package com.sa.datastructuries.bigo

class BigOBasics {

    val array = arrayOf("Nemo")
    val array10 = arrayOf("Nemo","Nemo","Nemo","Nemo","Nemo","Nemo","Nemo","Nemo","Nemo","Nemo")
    val arrayBig = Array(1_000_000){ if(it % 2 == 0) "Nemo" else it.toString() }

    fun findNemo(input: Array<String>) {
        val t0 = System.currentTimeMillis()
        input.forEach {
            if (it == "Nemo") {
                println("Was found $it")
            }
        }
        val t1 = System.currentTimeMillis()
        println("findNemo func took ${t1 - t0} milliseconds")
    }
}

fun main() {
    val bigO = BigOBasics()
    bigO.findNemo(bigO.array)
    bigO.findNemo(bigO.array10)
    bigO.findNemo(bigO.arrayBig)
}