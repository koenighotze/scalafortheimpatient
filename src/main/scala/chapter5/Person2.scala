package chapter5

/**
 * Created by dschmitz on 07.01.15.
 */
class Person2 private(val firstName: String, val lastName: String) {
  // question: how to create tmp vars?
  //  private[this] val tmp = name.split(" ")
  //  val firstName = tmp(0)
  //  val lastName = tmp(1)

  def this(name: String) {
    this(name.split(" ")(0), name.split(" ")(1))
  }
}

object Person2Test extends App {
  val p = new Person2("Fred Feuerstein")

  println(p.firstName)
  println(p.lastName)
}
