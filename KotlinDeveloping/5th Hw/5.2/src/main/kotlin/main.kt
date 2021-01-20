package ru.netology


fun main() {
    val firstPost = Post(
        8L,
        "first post",
        "12.01.2021",
        "title1"
    )

    val secondPost = Post(
        8L,
        "second post",
        "12.01.2021",
        "title2"
    )

    val thirdPost = Post(
        8L,
        "third post",
        "12.01.2021",
        "title3"
    )

    val copy = firstPost.copy(likes = 783)

    // добвление постов в массив
    WallService.add(firstPost); WallService.add(secondPost); WallService.add(thirdPost)

    //блок вывода
    println(WallService.posts)
    println(WallService.outputPosts())
    println((WallService.posts[1]).id)


   /* println(firstPost)
    println(copy)
    println(firstPost == copy)

    */

}