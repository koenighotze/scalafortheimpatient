package chapter4

import scala.collection.JavaConversions.propertiesAsScalaMap

/**
 * Created by dschmitz on 29.12.14.
 */
object ex4_7 extends App {
  val props : scala.collection.Map[String, String] = System.getProperties

  val maxKeyLength = props.keys.maxBy(f => f.length)


  for ((k, v) <- props) {
    val format = "%-" + maxKeyLength.length +"s | %s"
    println(String.format(format, k, v))
  }
}
