open class MyparentClass{
  val dad="he likes chapaing her"
  val mum="She likes being chapad by him"
}
class MyBoyClass:MyparentClass(){
    fun Myboy(){
        println(dad)
    }

}
class MyGirlClass:MyparentClass(){
    fun Mygirl(){
        println(mum)
    }
}

fun main(args: Array<String>) {
    val kijana=MyBoyClass()
    kijana.Myboy()
    val kasichana=MyGirlClass()
    kasichana.Mygirl()

}

