
package chapter7

import java.time.LocalTime
import java.util.Date

package object random {
  val a = 1664525
  val b = 1013904423
  val n = 32
  var previous = 20



  def nextInt() : Int = {
    nextDouble().toInt
  }

  def nextDouble() : Double = {
    previous = (previous * a + b) % n

    previous
  }

  def setSeed(seed : Int) = previous = seed
}


