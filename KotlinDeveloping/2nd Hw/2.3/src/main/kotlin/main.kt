fun main() {

    var amountToday: Int = 5000
    var amountLast: Int = 15000
    var musicLover: Boolean = true

    println("покупка: $amountToday ")
    usualDiscountText(amountLast, amountToday, musicLover)

}



fun usualDiscountText(amountLast:Int, amountToday:Int, musicLover: Boolean) {

    if ((amountLast >= 0) && (amountLast <= 1000)){

        println("после применения 0% скидки - $amountToday")

        if(musicLover){
            println("после применения 1% скидки - "+(amountToday - amountToday / 100))
        }

    } else if((amountLast >= 1001) && (amountLast <= 10000)){

        println("после применения скидки размером 100 рублей - " + (amountToday - 100))

        if(musicLover){
            println("после применения 1% скидки - "+ (amountToday - (amountToday - 100) / 100))
        }

    } else if (amountLast >= 10001){

        println("после применения 5% скидки - " + (amountToday - amountToday * 5 / 100))

        if(musicLover){
            println("после применения 1% скидки - "+ ((amountToday - amountToday * 5 / 100) - ((amountToday - amountToday * 5 / 100) / 100)))
        }

    } else{

        println("Error:  Ошибка формата данных")

    }


}
