fun main() {
    var cardType: String = "Mastercard" // переменные для проверки
    //var cardType: String = "Maestro" // переменные для проверки
    //var cardType: String = "Vk Pay" // переменные для проверки
    //var cardType: String = "Visa" // переменные для проверки
    //var cardType: String = "Мир" // переменные для проверки

    var amountPerMonth: Int = 0
    var amountOfTransaction: Int = 140000

    if (raschet(cardType, amountPerMonth, amountOfTransaction) == -1.0){
        println ("Перевод не выполнен. Причина: нарушение условий использования банковской карты.")
    }else{
        println("Комиссия на перевод: " + raschet(cardType, amountPerMonth, amountOfTransaction))
    }

}