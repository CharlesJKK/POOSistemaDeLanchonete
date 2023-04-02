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
        val serviceRate = (0..10).random()
        val totalPrice = mutableListOf<Int>()

        do{
            print("Temos pizza e salgados, o que você deseja pedir?")
            var clientOrder = readLine().toString()

            when(clientOrder.lowercase()){
                "pizza" -> {
                    println("Massa Fina, média ou grossa?")
                    val pasta = readLine()
                    println("Recheio de Calabresa, Frango ou Camarão?")
                    val filling = readLine()
                    val pizza = Pizza(pasta.toString(), filling.toString())

                    totalPrice.add(pizza.calculatePrice())

                }
                "salgado" -> {
                    println("Massa Crocante ou Fofa?")
                    val pasta = readLine()
                    println("Recheio de Calabresa, Frango ou Camarão?")
                    val filling = readLine()

                    val salgado = Salgado(pasta.toString(), filling.toString())
                    totalPrice.add(salgado.calculatePrice())
                }
            }
            println("Para continuar pedindo digite 1 e para parar digite 2")
            val getOut = readLine().toString()
        } while (getOut.lowercase() != "2")
        
    }
}