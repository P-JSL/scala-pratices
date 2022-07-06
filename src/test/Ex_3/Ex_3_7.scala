package test.Ex_3

object Ex_3_7 {
  def main(args: Array[String]): Unit = {
    for(x <-1 until 5){
      for( y<-1 until 5){
        println(x + " * " + y +" = " + x * y + "!") 
      }
    }
  }
}