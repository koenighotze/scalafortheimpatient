package chapter5

/**
 * Created by dschmitz on 07.01.15.
 */
//class Employee(var name : String, var salary : Double) {
//  def this() { this("John Public", 110.0d) }
//
//  override def toString = name + " " + salary
//}

class Employee(var name : String = "John Public", var salary : Double = 110.0d) {
  override def toString = name + " " + salary
}


object Employee extends App {
  println(new Employee())
  println(new Employee("foo", 12d))
}
