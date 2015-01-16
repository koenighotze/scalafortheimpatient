package chapter4

import java.util.Collections

import scala.util.Random

/**
 * Created by dschmitz on 29.12.14.
 */
object ex4_8 extends App {

  def minmax(values : Array[Int]) : Tuple2[Int, Int] = {
    (values.min, values.max)
  }


  val test = Random.shuffle(1 to 20).toArray

  println(minmax(test))

}
