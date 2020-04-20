package Test

class Student
{
  def details: Unit =
  {
    val s= " Shivam "
     println(" My name is " +s)
  }
}
class Teacher extends Student
{
  println(" I am Teacher")
}
object file1  extends App{

  val s= new Teacher
  s.details

}
