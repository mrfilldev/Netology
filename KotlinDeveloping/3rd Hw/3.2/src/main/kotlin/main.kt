fun main() {
    val cardType: String = "Mastercard" // переменные для проверки
    //val cardType: String = "Maestro" // переменные для проверки
    //val cardType: String = "Vk Pay" // переменные для проверки
    //val cardType: String = "Visa" // переменные для проверки
    //val cardType: String = "Мир" // переменные для проверки

    val amountPerMonth: Int = 0
    val amountOfTransaction: Int = 140000

    if (Raschet(cardType, amountPerMonth, amountOfTransaction) == -1.0){
        println ("Перевод не выполнен. Причина: нарушение условий использования банковской карты.")
    }else{
        println("Комиссия на перевод: " + Raschet(cardType, amountPerMonth, amountOfTransaction))
    }

}