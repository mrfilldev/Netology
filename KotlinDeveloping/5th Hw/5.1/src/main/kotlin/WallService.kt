package ru.netology

class WallService {
    var id = 0L
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val copy = post.copy(id = id++)
        posts += copy
        return post
    }

    fun likeById(id: Long) {
        posts.forEachIndexed { index, post ->
            if (post.id == id) {
                val target = posts[index]
                posts[index] = target.copy(likes = target.likes + 1)
            }
        }
    }

}