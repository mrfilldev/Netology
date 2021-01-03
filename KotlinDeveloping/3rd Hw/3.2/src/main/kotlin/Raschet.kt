fun Raschet(
    type: String = "Vk Pay",
    amountPerMonth: Int = 0,
    amountOfTransaction: Int
    ): Double {

    return if(cardControl(type, amountOfTransaction, amountPerMonth) == -1.0){
        -1.0
    } else {

        when (type) { // обаботка типажа карты и определение мес. огранич.
            "Vk Pay" -> 0.0
            "Mastercard" -> masterMaestroTransaction(amountOfTransaction)
            "Maestro" -> masterMaestroTransaction(amountOfTransaction)
            "Visa" -> visaMirTransaction(amountOfTransaction)
            "Мир" -> visaMirTransaction(amountOfTransaction)
            else -> -1.0
        }

    }

}

fun masterMaestroTransaction (transaction: Int): Double{
    return if (transaction < 75000){
        0.0
    } else{
        (transaction * 6 / 1000 + 20).toDouble()
    }
}

fun visaMirTransaction (transaction: Int): Double{
    return if (transaction * 75 / 10000 > 35){
        (transaction * 75 / 10000).toDouble()
    } else {
        35.0
    }
}

fun cardControl(

    type: String,
    transaction: Int,
    sumLastTransaction: Int

):Double {

    var maxTransaction: Int
    var maxForMonth: Int
    
    if (type == "Vk Pay"){
        maxTransaction = 15000
        maxForMonth = 40000
    }else{
        maxTransaction = 150000
        maxForMonth = 600000
    }

    return if ((transaction > maxTransaction) || (sumLastTransaction > maxForMonth)) {
        -1.0
    } else{
        0.0
    }

}

