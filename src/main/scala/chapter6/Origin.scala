package chapter6


/**
 * Created by dschmitz on 17.02.15.
 */
object Origin extends java.awt.Point(3, 4) {

}

object Ex63Test extends App {
  // Mutable singletons...nice
  Origin.x = 4
}
