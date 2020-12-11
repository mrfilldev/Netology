fun main() {
    var checkTotal: Double = 50000.0

    var fivePercentDiscount: Double = 2.0

    var amount: Int = 10 // сумма покупок
    var everymonthuser: Boolean = true


    if ((amount >= 0) && (amount <= 1000)){
        checkTotal -= 0
    }else if((amount >= 1001) && (amount <= 10_000)){
        checkTotal -= 100
    }else{
        checkTotal = checkTotal - (checkTotal * 0.05)
    }

    println("Покупка: $checkTotal ")
    //println("После применения 5% скидки: $fivePercentDiscount")
    //println("После применения 1% скидки: $onePercentDiscount ")

}