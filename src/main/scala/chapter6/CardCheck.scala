package chapter6

import chapter6.Suits.Suits


/**
 * Created by dschmitz on 17.02.15.
 */
object CardCheck extends App {


  // w/o alias
  // def isRed(s : Suits.Value) =

  // using the Value alias
  def isRed(s: Suits) =
    s == Suits.Diamonds || s == Suits.Hearts

  println(isRed(Suits.Clubs))
}
