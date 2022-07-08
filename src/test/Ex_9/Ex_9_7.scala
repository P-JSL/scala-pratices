package test.Ex_9

object Ex_9_7 {

  object Compainon{
    private def ma = {}
    def mb = {}
  }
  class Compainon {
    val a = Compainon.ma
    val b = Compainon.mb
  }
  
  def main(args: Array[String]): Unit = {
    println(Compainon.mb)
  }
}
