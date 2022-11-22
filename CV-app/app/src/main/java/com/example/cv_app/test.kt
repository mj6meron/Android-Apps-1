package com.example.cv_app

fun main() {
    start()
}

fun start() {
    val sentences = mutableListOf("sentence 1")
    sentences += ("sentence 2")
    sentences += ("sentence 3")
    sentences += ("sentence 4")
    sentences += ("sentence 5")
    sentences += ("sentence 6")
    sentences += ("sentence 7")
    sentences += ("sentence 8")
    sentences += ("sentence 9")
    sentences += ("sentence 10")
    print (sentences[(0..10).random()])

}
