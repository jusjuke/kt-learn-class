fun main(args: Array<String>) {
    val employee = Employee("John")
    println(employee.firstName)
    employee.firstName = "Mike"
    employee.fullTime = true
    println(employee.firstName)
    val employee2 = Employee("Davit", true)
    println(employee2.fullTime)

    val car = Car("Blue", "Toyota", 2015)
    println(car)

    val employee3 = Employee("Davit", true)
    println(employee2 == employee3)
    val car2 = Car("Blue", "Toyota", 2015)
    println(car == car2)
    val car3 = car.copy()
    println(car3)
    println(car.copy(year = 2016, color="green"))
}
/**
class Employee constructor(firstName: String){
    val firstName: String
    init {
        this.firstName = firstName
    }
}

class Employee constructor(firstName: String){
    val firstName: String = firstName
}

class Employee constructor(val firstName: String)

class Employee constructor(val firstName: String){
    var fullTime: Boolean = false
    constructor(firstName: String, fullTime: Boolean) : this(firstName){
        this.fullTime = fullTime
    }
}
class Employee constructor(val firstName: String, private val fullTime:Boolean = false)

class Employee constructor(var firstName: String, var fullTime:Boolean = false)
 **/
class Employee(var firstName: String, fullTime:Boolean = false){
    var fullTime = fullTime
        get(){
            println("Running custom get")
            return field
        }
        set(value){
            println("Runing custom set")
            field = value
        }
}
data class Car(val color: String, val model: String, val year: Int){

}