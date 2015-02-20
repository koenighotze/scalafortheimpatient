package chapter4

import scala.collection.mutable
import java.io.File
import java.util.Scanner

/**
 * Created by dschmitz on 29.12.14.
 */
class ex4_2 {

  def readWords(fname : String) : mutable.Map[String, Int] = {
    val in = new Scanner(new File(fname))

    val result = mutable.Map[String, Int]().withDefault( _ => 0)
    while (in.hasNext) {
      result(in.next().toUpperCase()) += 1
    }
    result
  }

}

object ex4_2 {
  def main(args: Array[String]): Unit = {
    val res = new ex4_2().readWords("/Users/dschmitz/dev/scala/src/chapter4/foo.txt")
    println("Workcount:")

    for ((k, v) <- res) println(k + " => " + v)
  }
}
