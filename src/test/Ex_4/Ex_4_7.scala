package test.Ex_4

object Ex_4_7 {
  def main(args: Array[String]): Unit = {
    val pig = new Pig
    pig.eat
    pig.shout
    pig.fly
  }
  
  class Pig extends Animal with Flying with Eating{
    def shout = println("꿀꿀")
    def eat = println("쩝쩝")
  }
  
  abstract class Animal {
    def shout
  }
  
 trait Swimming{
  def swim = println("수영을 합니다.")
}

trait Flying{
  def fly = println("납니다.")
}

trait Running{
  def run = println("달립니다.")
}

trait Eating{
  def eat
} 
}