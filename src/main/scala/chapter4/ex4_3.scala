package chapter4

import java.io.File
import java.util
import java.util.Scanner

import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.immutable.SortedMap
import scala.collection.mutable

/**
 * Created by dschmitz on 29.12.14.
 */
object ex4_3 extends App {
  val FNAME = "/Users/dschmitz/dev/scala/src/chapter4/foo.txt"

  def readWords(fname: String): Map[String, Int] = {
    val in = new Scanner(new File(fname))

    var result = Map[String, Int]() withDefault (_ => 0)

    while (in.hasNext) {
      val n = in.next().toUpperCase()

      result = result + (n -> (result(n) + 1))
    }

    result
  }

  def printMap[T <: Map[String, Int]](map: T) = {
    for ((k, v) <- map) {
      println(k + " -> " + v)
    }
  }


  //  printMap(readWords(FNAME))

  // ex 4.4
  def readSortedWords(fname: String): Map[String, Int] = {
    val in = new Scanner(new File(fname))

    var result = SortedMap[String, Int]().withDefault(_ => 0)

    while (in.hasNext) {
      val n = in.next().toUpperCase()

      result = result + (n -> (result(n) + 1))
    }

    result
  }

  //  printMap(readSortedWords(FNAME))


  def readWithTreeMap(fname: String): mutable.Map[String, Int] = {
    val in = new Scanner(new File(fname))

    val result = new util.TreeMap[String, Int]().withDefault(_ => 0)

    while (in.hasNext) {
      val n = in.next().toUpperCase()

      result(n) += 1
    }

    result
  }

  for ((k, v) <- readWithTreeMap(FNAME)) {
    println(k + ", " + v)
  }

  //  printMap(readWithTreeMap(FNAME))

}
