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
object file1  extends App{

  val s= new Add
  s.details

}