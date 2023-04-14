class Wanafunzi(val name:String, var age:Int,var gender:String,var house:String){

}

fun main(args: Array<String>) {
    val obj=Wanafunzi(name = "Trent", age = 21, gender = "Male", house = "Grieve")
    println("My name is ${obj.name}")
    println("I'm ${obj.age} years old")
    println("I am a ${obj.gender}")
    println("I am in ${obj.house} house")
    println("My name is ${obj.name}"+ "I'm ${obj.age} years old"+ "I am a ${obj.gender}"+ "I am in ${obj.house} house")
}