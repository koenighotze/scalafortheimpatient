package chapter5

/**
 * Created by dschmitz on 07.01.15.
 */
class Person(myAge: Int) {
  // code is part of primary constructor
  val age = if (myAge < 0) 0 else myAge

  override def toString = "Person of age " + age
}

object PersonTest extends App {

  println(new Person(12))
  println(new Person(-12))
  println(new Person(-12).age)

}
