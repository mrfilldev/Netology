fun main() {
    val likes = 3

    if ((likes % 10 == 1) &&(likes != 11)){

        println("Поставлен $likes лайк ")

    }else if(((likes != 12) && (likes % 10 == 2)) ||
            ((likes != 13) && (likes % 10 == 3)) ||
            ((likes != 14) && (likes % 10 == 4))){

        println("Поставлено $likes лайка ")

    }else if((20 < likes) && ((likes % 10 == 5) || (likes % 10 == 6) || (likes % 10 == 7)
                || (likes % 10 == 8) || (likes % 10 == 9) || (likes % 10 == 0))){

        println("Поставлено $likes лайков ")

    }else if(likes in 5..20) {

        println("Поставлено $likes лайков ")

    }

}