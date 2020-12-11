// функция обработки под правильный вывод часов
fun hours(time: Int): String {

    var answer: String = "err0r"

    if ((time % 10 == 1) &&(time != 11)){
        answer = "час"
    }else if(((time != 12) && (time % 10 == 2)) ||
        ((time != 13) && (time % 10 == 3)) ||
        ((time != 14) && (time % 10 == 4))){

        answer = "часа"
    }else if((20 < time) && ((time % 10 == 5) || (time % 10 == 6) || (time % 10 == 7)
                || (time % 10 == 8) || (time % 10 == 9) || (time % 10 == 0))){

        answer = "часов"

    }else if(time in 5..20) {

        answer = "часов"

    }
    return answer
}
