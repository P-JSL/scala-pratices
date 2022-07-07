package test.Ex_4

object Ex_4_5 {

  def main(args: Array[String]): Unit = {
    val FlyingWhale = new Animal
    FlyingWhale.swim
    FlyingWhale.fly
  }

class Animal extends Flying with Swimming

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