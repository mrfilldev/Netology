fun raschet(
    type: String = "Vk Pay",
    sumPerMonth: Int = 0,
    transaction: Int
): String {

    var result: Int = 0
    var sumPerMonthMax = 0

    var way: Int = when (type){ // обаботка типажа карты и определение мес. огранич.
        "Vk Pay" -> 1.also { sumPerMonthMax = 40000_00 }
        "Mastercard" -> 2.also{sumPerMonthMax = 600000_00} //ВСЕ В КОПЕЙКАХ !!!
        "Maestro" -> 3.also{sumPerMonthMax = 600000_00}
        "Visa" -> 4.also{sumPerMonthMax = 600000_00}
        "Мир" -> 5.also{sumPerMonthMax = 600000_00}
        else -> 0
    }

    if (transaction > (sumPerMonthMax - sumPerMonth)){
        return " Error: Ваш лимит превышен "
    }else if(way == 0){
        return " Error: Неизвестная ошибка "
    }else if((way == 4 || way == 5) && transaction < 35_00){
        return " Error: Условия вашей карты не позволяют " +
                "совершать переводы менее 35 рублей"
    }else if((way == 1)&& transaction > 15000_00){
        return " Error: Условия вашей карты не позволяют " +
                "совершать переводы более 15000 рублей в сутки\""
    }

    if (way == 1){
        result = 0
    }else if ((way == 2) && (way == 3)){
        result = if (transaction in 0..75000_00){
            0
        } else{
            transaction * 6 / 1000 + 20
        }
    }else if((way == 4) && (way == 5)) {
        result = if (transaction in 0..75000_00){
            0
        } else{
            transaction * 75 / 10000
        }
    }

    return (" Информация о переводе: $result $type \n" +
            " - Комиссия: " +
            result / 100 + " рублей " +
            result % 100 +" копеек " +
    "\n - Сумма перевода: " +
            transaction / 100 + " рублей " +
            transaction % 100 + " копеек " + '\n')

}