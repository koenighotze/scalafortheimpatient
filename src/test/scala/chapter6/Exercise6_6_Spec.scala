package chapter6

import org.scalatest.{Matchers, FlatSpec}

import scala.collection.mutable.Stack

import org.scalatest._

/**
 * Created by dschmitz on 20.02.15.
 */
class Exercise6_6_Spec extends FlatSpec with Matchers {
  "A card of diamonds " should " be recognized as red " in {
    Suits.isRed(Suits.Diamonds) should be (true)
  }

}
