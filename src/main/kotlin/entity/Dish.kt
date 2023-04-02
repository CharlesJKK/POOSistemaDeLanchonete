package entity

abstract class Dish(val pasta: String, val filling: String) {

    abstract fun calculatePrice(): Int


}

class Pizza(pasta: String, filling: String): Dish(pasta, filling){

    override fun calculatePrice(): Int {
        val price = pasta.length * filling.length
        return price
    }

}

class Salgado(pasta: String, filling: String): Dish(pasta, filling){
    override fun calculatePrice(): Int {
        val price = pasta.length * filling.length
        return price
    }
}