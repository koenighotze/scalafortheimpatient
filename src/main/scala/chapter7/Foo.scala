package com.horstman.impatient
class Foo {
  println(classOf[Foo])
  // val l = new Inner() not possible
  val l = new com.horstman.Inner()

}
