package diego.app.diego.com.proyinscripcion.model

import java.io.Serializable

class Person:Serializable {
    constructor(nombre: String?, cargo: String?, identifiacion: Int?) {
        this.nombre = nombre
        this.cargo = cargo
        this.identificacion = identifiacion
    }
    constructor(nombre: String?, cargo: String?, identificacion: Int?,flag:Int?) {
        this.nombre = nombre
        this.cargo = cargo
        this.identificacion = identificacion
        this.flag = flag
    }

    var nombre: String? = null
    var cargo: String? = null
    var identificacion: Int? = null
    var flag: Int? = null
}
