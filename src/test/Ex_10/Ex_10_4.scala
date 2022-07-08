package test.Ex_10

import scala.util.Random
import test.Ex_10.Ex_10_3.calcBallCountSeq

object Ex_10_4 {
  var ex101 = new Ex_10_1()
  
  def main(args: Array[String]): Unit = {
    println("숫자야구 게임 시작")
    val ballList = Random.shuffle(0 to 9).drop(7)
    
    while(true){
      println("숫자를 입력하세요 (000-999)")
      var inputList = ex101.convertInputs(readLine)
      
      if(inputList != None){
        val ballCount = calcBallCountSeq(ballList, inputList.get)
        /*
        ballCount match{
          case ballCount(0,0,0) => println("아웃")
        } //match end*/
        
        /**
         * 에러가 나서 진행불가
         * */
        
      }//if end
      
    }//while end
  }
}