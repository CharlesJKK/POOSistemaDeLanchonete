package control

import entity.Pizza
import entity.Salgado

class Restaurant {

    init {
        println("Restaurante aberto!")
        order()
    }

    fun order(){
        print("Qual seu nome?")
        val clientName = readLine()
        val serviceRate = Math.random()
        val allOrdersPrice = mutableListOf<Int>()
        var totalPrice: Int = 0

        do{
            print("Temos pizza e salgados, o que você deseja pedir?")
            var clientOrder = readLine().toString()

            when(clientOrder.lowercase()){
                "pizza" -> {
                    print("Massa Fina, média ou grossa?")
                    val pasta = readLine()
                    print("Recheio de Calabresa, Frango ou Camarão?")
                    val filling = readLine()
                    val pizza = Pizza(pasta.toString(), filling.toString())

                    allOrdersPrice.add(pizza.calculatePrice())

                }
                "salgado" -> {
                    print("Massa Crocante ou Fofa?")
                    val pasta = readLine()
                    print("Recheio de Calabresa, Frango ou Camarão?")
                    val filling = readLine()

                    val salgado = Salgado(pasta.toString(), filling.toString())
                    allOrdersPrice.add(salgado.calculatePrice())
                }
            }
            print("Para continuar pedindo digite 1 e para parar digite 2: ")
            val getOut = readLine().toString()
        } while (getOut.lowercase() != "2")

        for(order in allOrdersPrice){
            totalPrice = totalPrice + order
        }

        println("O total do seu pedido ficou R$${totalPrice * serviceRate} Reais")
    }
}