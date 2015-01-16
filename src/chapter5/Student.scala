package chapter5

import scala.beans.BeanProperty

/**
 * Created by dschmitz on 06.01.15.
 */
class Student(var name : String, _id : Long) {
  // generates a setId method
  @BeanProperty var id = _id



  override def toString() = id + "] " + name
}

object Foo extends App {
  val student = new Student("foo", 123)

  println(student)

  // accessing the setter directly
  student.name_$eq("bar")
  println(student)
}