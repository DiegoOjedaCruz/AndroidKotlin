open class Person() {
    var name: String? = null
    var lasName: String? = null
    var identify: Int? = null

    constructor (name:String,lasName: String,identify: Int) : this() {
        this.lasName = lasName
        this.name = name
        this.identify = identify
    }




}