package ru.netology

fun main() {
    val post = Post(
        8L,
        "test test",
        "12.01.2021",
        "title"
    )

    val copy = post.copy(likes = 783)

    println(post)
    println(copy)
    println(post == copy)

}