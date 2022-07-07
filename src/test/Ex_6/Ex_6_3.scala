package test.Ex_6

object Ex_6_3 {
  def main(args: Array[String]): Unit = {
     val number1 = "010-222-2222"
     val number2 = "119"
     val number3 = "포도먹은돼지"
     val numberList  = List(number1,number2,number3)
     
     for(number <- numberList){
       number match {
         case Emergency() => println("긴급전화")
         case Normal(number) => println("일반전화 :" + number)
         case _ => println("판단불가")
       }
     }
  }
}

object Emergency{
  def unapply(number:String):Boolean = {
    if(number.length == 3 && number.forall(_.isDigit)) true
    else false
  }
}

object Normal {
  def unapply(number : String):Option[Int] = {
    try{
      var o = number.replaceAll("-","")
      Some(number.replaceAll("-","").toInt)
    }catch{
      case _: Throwable => None
    }
  }
}