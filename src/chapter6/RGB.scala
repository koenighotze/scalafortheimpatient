package chapter6

/**
 * Created by dschmitz on 18.02.15.
 */
object RGB extends Enumeration {
  type RGB = Value

  val Red = Value(0xFF0000, "red")
  val Green = Value(0x00FF00, "green")
  val Blue = Value(0x0000FF, "blue")

}

object Test6_8 extends App {
  println(RGB.Red)
}

