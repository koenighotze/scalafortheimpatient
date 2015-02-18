package chapter6

import chapter6.Suits.Diamonds

/**
 * Created by dschmitz on 17.02.15.
 */
object Suits extends Enumeration {
  // create alias for enum
  type Suits = Value


  val Diamonds = Value(0, "D")
  val Clubs = Value(1, "C")
  val Hearts = Value(2, "H")
  val Spades = Value(3, "S")

  // this is not much better than the version using an explicit function
  // TODO: how to move logic to an enum like in Java
  def isRed(s : Suits) = s == Diamonds || s == Hearts

  val hearsSuits = List(Diamonds, Hearts)
  def isRed2(s : Suits) = hearsSuits.contains(s)
}


object TestEx6_6 extends App {
  Suits.values.foreach( v => println(v))

  assert(Suits.isRed(Suits.Diamonds))
  assert(!Suits.isRed(Suits.Spades))

  assert(!Suits.isRed2(Suits.Spades))

}