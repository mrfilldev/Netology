fun main() {
    var checkTotal: Double = 50000.0
    var Total: Double = 50000.0 // итог сегодняшней покупки

    var onePercentDiscount: Double = 0.0
    var fiftyPercentDiscount: Double = 0.0

    var amount: Int = 10 // сумма покупок
    var everymonthuser: Boolean = true


    if (((amount >= 0) && (amount <= 1000)) && everymonthuser){
        checkTotal -= 0
        onePercentDiscount = (checkTotal - checkTotal * 1 / 100)
    }else if(((amount >= 1001) && (amount <= 10_000)) && everymonthuser){
        checkTotal -= 100
        onePercentDiscount = (checkTotal - checkTotal * 1 / 100)
    }else if((amount > 10_000) && !everymonthuser){
        fiftyPercentDiscount = Total - (Total * 5 / 100)
    }else if((amount > 10_000) && everymonthuser){
        fiftyPercentDiscount = Total - (Total * 5 / 100)
        onePercentDiscount = (fiftyPercentDiscount - fiftyPercentDiscount * 1 / 100)
    }

    println("Покупка: $Total ")
    println("После применения 5% скидки: $fiftyPercentDiscount")
    println("После применения 1% скидки: $onePercentDiscount ")

}