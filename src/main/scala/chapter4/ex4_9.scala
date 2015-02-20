package chapter4

import scala.util.Random

/**
 * Created by dschmitz on 29.12.14.
 */
object ex4_9 extends App {
  def lteqgt(values: Array[Int], v: Int) = {
    (values.filter(_ < v).sorted, values.filter(_ == v).sorted, values.filter(_ > v).sorted)
  }


  val test = Random.shuffle(1 to 20).toArray

  val r = 7
  val res = lteqgt(test, r)
  println(r + " > " + res._1.mkString(" "))
  println(r + " == " + res._2.mkString(" "))
  println(r + " < " + res._3.mkString(" "))


}
