package test.Ex_9

object Ex_9_6 {
  
  def main(args: Array[String]): Unit = {
    println(Object1.mb)
    println(Object2.b)
  }
}

object Object1 {
  private def ma = {}
  def mb = {}
}

object Object2{
 // val a = Object1.ma //compile error
  val b = Object1.mb
}