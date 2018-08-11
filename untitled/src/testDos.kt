fun main(args: Array<String>) {
    var product = product()
    val regex = """\d+""".toRegex()
    product.code = 1
    product.name = "arroz"
    product.cantidad = 5
    product.precio = 2000

    var product2 = product()
    product2.code = 2
    product2.name = "carne"
    product2.cantidad = 7
    product2.precio = 4000

    var product3 = product()
    product3.code = 3
    product3.name = "frijoles"
    product3.cantidad = 8
    product3.precio = 1000

    var array = arrayOf(product, product2, product2)
    println("digite el numero del producto")
    var codigo = readLine()
    if (regex.matches(codigo.toString())) {
        val cod = codigo.toString().toInt()
        val g = array.firstOrNull { x -> x.code == cod }
        if (g != null) {
            println("el nombre es ${g.name}")
        }
    }
}
