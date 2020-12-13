fun main() {
    var cardType: String = "Mastercard"
    //var cardType: String = "Maestro"
    //var cardType: String = "Vkpay"
    //var cardType: String = "Visa"
    //var cardType: String = "Мир"

    var sumPerMonth: Int = 0
    var transaction: Int = 55000_00 // сумма перевода в копейках

    println (raschet(cardType, sumPerMonth, transaction))

}