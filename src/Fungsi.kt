
fun main(args: Array<String>){
    customer(1200000)
}

fun customer(money: Int){
    var total: Int = 0
    var cart = arrayOf("Keyboard", "Mouse")
    for(item in cart){
        total += store(item)
    }
    checkout(money, total)
}

fun store(item: String) : Int {
    return when(item){
            "Monitor" -> 1000000
            "Mouse" -> 20000
            "Keyboard" -> 50000
            else -> 0
    }
}

fun checkout(money: Int, total: Int){
    if(money >= total){
        val result = money - total
        println("Transaction successfully!")
        println("Total transaction = $total")
        println("Rest of the money = $result")
    }else{
        println("Transaction Failed, money is not enough!")
    }
}