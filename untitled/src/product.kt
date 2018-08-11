class product() {
    var code: Int? = null
    var name: String? = null
    var cantidad: Int? = null
    var precio: Int? = null

    constructor(code: Int, name: String, cantidad: Int, precio: Int) : this() {
        this.code = code
        this.name = name
        this.cantidad = cantidad
        this.precio = precio
    }
}