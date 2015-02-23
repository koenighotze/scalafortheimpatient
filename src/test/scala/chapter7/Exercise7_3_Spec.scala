package chapter7

import org.scalatest.{Matchers, FlatSpec}
import org.scalatest.Assertions._
import org.scalatest._

/**
 * Created by dschmitz on 20.02.15.
 */
class Exercise7_3_Spec extends scalafortheimpatient.UnitSpec  {

  "nextInt" must "return a random int " in {
    val n = chapter7.random.nextInt()

    Assertions.assert(n >= 0)
  }

  "multiple nextInt calls " should " return different numbers " in {
    val first = chapter7.random.nextInt()
    val second = chapter7.random.nextInt()
    assert(first != second)
  }

  "nextDouble" should "return a random double " in {
    val n = chapter7.random.nextDouble()


    assert(n >= 0)
  }

  "setSeed" should "result in reproducible numbers" in {
    chapter7.random.setSeed(12)

    val n = chapter7.random.nextInt()

    chapter7.random.setSeed(12)
    assert(n == chapter7.random.nextInt())
  }
}
