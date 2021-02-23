package ru.netology

import org.junit.Test
import org.junit.Assert.*
import ru.netology.WallService.add

class TestKt {

    @Test
    fun add_idNotZero(){
        // arrange
        val firstPost = Post(
            8L,
            "first post",
            "12.01.2021",
            "title1"
        )
        // act
        val result = add(post = firstPost)
        // assert
        assertEquals(9L, result.id)
    }
}