package ru.netology

object WallService {
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

    fun update(post: Post): Boolean{ // функця заглушка
        for (post in posts)

        if ()


    }

    fun outputPosts(){
        for (post in posts){
            println(post)
        }
    }
}