fun main(args: Array<String>) {
    //for loop
    //Write a Kotlin program that uses a forloop to
    //orint out even numbers between 1 and 10
    for (i in 10..20){
        println("Loop $i")
    }
    for (nambar in 1..10)
    {
        println("Loop $nambar")
    }






    var myarray= arrayOf("Loma", "Seka","Alexander-Arnold")
    for (jina in myarray){
        println(jina)
    }
    //while loop
    var namabari=5
    while (namabari<=10){
        println("Loop $namabari")
        namabari+=2
    }
    var deal=50
    while (deal>=10){
        println("Loop $deal")
        deal--
    }

//do ..while loops
    var numloop=100
    do {
        println("loop $numloop")
        numloop+=2
    }while (false)
}