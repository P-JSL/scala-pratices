package test.Ex_9

import java.io.PrintWriter
import java.io.File

object Ex_9_5 {
  def main(args: Array[String]): Unit = {
    val fileName = "Ex_9_4_result.text"
    var input = readLine("파일에 쓸 내용을 입력하세요 : " )
    
    val writer = new PrintWriter(new File(fileName))
    writer.write(input)
    writer.close
    
    println("입력하신 " + input + " 텍스트를 " + fileName + "에 저장했습니다.")
  }
}