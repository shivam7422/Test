package Test

class Admin
{
  def details: Unit =
  {
    val s= " Kadipur "
     println(" I live in " +s)
  }
}
class Add extends  Admin
{
  println(" this is a dog")
}
 def details2: Unit =
  {
    println(" this is something else")
  }

}
object file1  extends App{
val x= new Add
  val s= new Admin
  s.details
  s.details2

}