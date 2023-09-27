fun main() {
    var w: Wolf? = Wolf()

    if (w != null) w.eat()

    var x = w?.hunger
    println("The value of x is $x")

    var y = w?.hunger ?: -1
    println("The value of y is $y")

    var myWolf = myWolf()
    myWolf?.wolf?.hunger = 8
    println("The value of myWolf?.wolf?.hunger is ${myWolf?.wolf?.hunger}")

    var myArray = arrayOf("Hi", "Hello", null)
    for (i in myArray){
        i?.let { println(it) }
    }

    getAlphaWolf()?.let{it.eat()}



}

class Wolf {
    var hunger = 10
    val food = "meat"

    fun eat() {
        println("The Wolf is eating $food")
    }
}

class myWolf {
    var wolf: Wolf? = Wolf()

    fun myFun(){
        wolf?.eat()
    }
}

fun getAlphaWolf () : Wolf? {
    return Wolf()
}