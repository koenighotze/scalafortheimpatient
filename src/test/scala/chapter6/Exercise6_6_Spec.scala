package chapter6

import org.scalatest.{Matchers, FlatSpec}

import scala.collection.mutable.Stack

import org.scalatest._

/**
 * Created by dschmitz on 20.02.15.
 */
class Exercise6_6_Spec extends FlatSpec with Matchers {


  "Eine Karo-Karte " should " als Rot erkannt werden " in {
    Suits.isRed(Suits.Diamonds) should be (true)
  }

}
