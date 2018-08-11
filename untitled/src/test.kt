var lastName: String? = null
var i = 0

fun main(args: Array<String>) {
    println("hola mundo")
    var num = 1 //variable de tipo mutable
    num = 5
    println("el valor es ${num}")

    val PI = 3.1416
    println("el valor es ${PI}")

    val nombre = "Diego"
    val nombre2: String = "askkakka"

    //Array
    var array = arrayOf(1, 0, 20, 5, 7, 9)


    for (num in array) {
        println("el valor es $num")
    }

    array.forEach {
        it
        println("numeros$it")
    }

    println("${array.get(2)}")


    for (x in 0..10) {
        println("el valor es ${x}")
    }
    for (x in 0..array.size - 1) {
        println("el tamaño del array es $x")
    }
    array.sort()
    array.forEach { it
    println("$it")
    }

    array.filter { num -> num > 6 }.forEach {
       println ("filtro $it")

    }

    for (x in 1..10) {
        for (l in 1..10) {
            var result = x*l
            println("la multiplicacion de $x * $l es = $result")
        }
    }


}

