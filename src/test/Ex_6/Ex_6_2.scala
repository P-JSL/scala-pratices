package test.Ex_6

object Ex_6_2 {
  case class Person(name : String, age : Int , rank:String)
  
   def main(args: Array[String]): Unit = {
     val person1 = Person("이엇남",47,"부회장")
     val person2 = Person("김괘남",73,"회장")
     val person3 = Person("김솔로",27,"사원")
     
     matchAndHi(person1)
     matchAndHi(person2)
     matchAndHi(person3)
  }
  
  def matchAndHi(person:Person):Unit = person match{
    case Person("이엇남",47,"부회장") => println("부회장님")
    case Person("김괘남",73,"회장") => println("회장님")
    case Person("김솔로",27,"사원") => println("솔로")
  }
}