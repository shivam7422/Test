package Test

class Student
{
  def details: Unit =
  {
    val s= " Shivam "
     println(" My name is " +s)
  }
}

object file1  extends App{

  val s= new Student
  s.details

}
