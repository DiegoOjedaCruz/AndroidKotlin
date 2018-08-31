package diego.app.diego.com.proyrecicler.models

import java.io.Serializable

class Country :Serializable{

    constructor(name: String?, description: String?, city: String?) {
        this.name = name
        this.description = description
        this.city = city
    }
    constructor(name: String?, description: String?, city: String?,flag:Int?) {
        this.name = name
        this.description = description
        this.city = city
        this.flag = flag
    }

    var name: String? = null
    var description: String? = null
    var city: String? = null
    var flag: Int? = null
}