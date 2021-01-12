package ru.netology

data class Post (

    val id: Long,
    val text: String,
    val date: String,
    val title: String,
    val likes: Int = 0,
    val reposts: Int = 0,
)