package chapter6

/**
 * Created by dschmitz on 17.02.15.
 */
class Point(val x: Int, val y: Int) {

  override def toString() = "x " + x + ", y " + y
}


object Point {
  def apply(x: Int, y: Int) = new Point(x, y)
}

object Test6_4 extends App {
  println(Point(1, 2))
}
