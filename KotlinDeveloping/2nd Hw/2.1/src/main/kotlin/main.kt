fun main() {

    var amount: Double = 35000.0
    var commission: Double

    if (amount > 35.0){
        if ((amount * 0.0075) > 35.0) {
            commission = amount * 0.0075
        } else {
            commission = 35.0
        }


        println("Комиссия $commission")
    }else {
        println("Недостаточно средств на счету!")
        println("платина логи  -_- ")
    }


}