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

