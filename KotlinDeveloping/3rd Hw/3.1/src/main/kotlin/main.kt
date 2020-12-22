fun main() {

    var seconds: Int = 78 //количество секунд отсутствия пользователя
    println(agoToText(seconds))

}



fun agoToText(seconds: Int): String {

    var time = when (seconds) {
        in 61..60*60 -> seconds / 60
        in 60*60+1..24*60*60 -> seconds /360
        else -> 0
    }

    return when (seconds){
        in 0..60 -> "был(а) только что"
        in 61..60*60 -> "был(а) $time " + minutes(time) +" назад"
        in 60*60+1..24*60*60 -> "был(а) $time " + hours(time) + " назад"
        in 24*60*60+1..24*60*60+24*60*60-> "был(а) сегодня"
        in 24*60*60+24*60*60+1..24*60*60+24*60*60+24*60*60 -> "был(а) вчера"
        else -> "был(а) давно"
    }

}



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
