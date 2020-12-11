// функция обработки под правильный вывод минут

fun minutes(time: Int): String {

    var answer: String = "err0r"

    if ((time % 10 == 1) &&(time != 11)){
        answer = "минуту"
    }else if(((time != 12) && (time % 10 == 2)) ||
        ((time != 13) && (time % 10 == 3)) ||
        ((time != 14) && (time % 10 == 4))){

        answer = "минута"
    }else if((20 < time) && ((time % 10 == 5) || (time % 10 == 6) || (time % 10 == 7)
                || (time % 10 == 8) || (time % 10 == 9) || (time % 10 == 0))){

        answer = "минут"

    }else if(time in 5..20) {

        answer = "минут"

    }
   return answer
}
