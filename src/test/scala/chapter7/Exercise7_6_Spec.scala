package chapter7

import java.util

import chapter7.Exercise76MapCopy._
import org.scalatest.{Matchers, FlatSpec}
import org.scalatest.Assertions._
import org.scalatest._

/**
 * Created by dschmitz on 20.02.15.
 */
class Exercise7_6_Spec extends scalafortheimpatient.UnitSpec  {

  "Copying a empty map" must "return a empty scala map" in {
    val javaMap = new util.HashMap[String, Int]()

    val scalaMap = copyFromJava(javaMap)

    assert(scalaMap.getClass() == classOf[Map[String, Int]], "message")
  }

  "Copying a non empty map" must "return a matching scala map" in {
    val javaMap = new util.HashMap[String, Int]()
    (1 to 10).foreach(i => javaMap.put("a Key " + i, i))

    val scalaMap = copyFromJava(javaMap)

    assert(scalaMap.getClass() == classOf[Map[String, Int]], "message")

  }

}
