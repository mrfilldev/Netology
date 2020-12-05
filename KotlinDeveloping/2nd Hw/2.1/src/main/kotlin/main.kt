fun main() {

    var amount: Double = 1000.0

    if (amount > 35.0){
        amount -= amount * 0.75
        println("Комиссия $amount")
    }else {
        println("Недостаточно средств на счету!")
        println("платина логи  -_- ")
    }


}