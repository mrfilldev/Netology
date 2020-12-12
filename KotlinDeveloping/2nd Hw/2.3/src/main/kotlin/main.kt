fun main() {
    val total: Int = 50998
    var checkTotal: Int = total * 100
    var fivePercentDiscount: Int = 0

    var everymonthuser: Boolean = true

    if ((checkTotal >= 0) && (checkTotal <= 1000)) {
        checkTotal -= 0
    } else if ((checkTotal >= 1001) && (checkTotal <= 10_000)) {
        checkTotal -= 100
    } else {
        checkTotal -= checkTotal * 5 / 100
        fivePercentDiscount = checkTotal
    }


    //rubles = checkTotal % 100
    println("Покупка: $total ")
    if (fivePercentDiscount != 0) {
        println("после применения 5% скидки - " + fivePercentDiscount / 100 + " рублей " + fivePercentDiscount % 100 + " копеек")
    }
    println(checkTotal)
    if (everymonthuser) {
        checkTotal -= checkTotal * 1 / 100
        println("После применения 1% скидки: " + checkTotal / 100 + " рублей " + checkTotal % 100 + " копеек")
    }
    //println("После применения 1% скидки: $onePercentDiscount ")

}