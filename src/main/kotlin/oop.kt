class Hesabu{
    //data member\
    private var number:Int=8

    //member function
    fun calculateSquare():Int{
        return number*number
    }

}
class loma(){
    var name="eMobilis"
    fun myname(){
        println(name)
    }
}
class rico(){
    var name="Drizzy feat. Meek Milly"
    fun myname(){
        println(name)
    }
}


fun main(args: Array<String>) {
    //create an object
    val myobj=Hesabu()
    println(myobj.calculateSquare())
    val myobj2=loma()
    println(myobj2.myname())
    val myobj3=rico()
    println(myobj3.myname())
}