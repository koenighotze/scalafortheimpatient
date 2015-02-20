object Solutionex3_1 extends App {

  import scala.util.Random

  def ex3_1(n: Int): Array[Int] = {
    return new Array[Int](n)
      .map((x: Int) => Random.nextInt(n))
  }


  ex3_1(7)
  ex3_1(4)
  ex3_1(10)
  //for (i <- 1 to 5)
  //  println(ex3_1(i))
  //
  //for (i <- 1 to 100)
  //  println(Random.nextInt(10))
  //
  //
  //val org = Array()
  //val c = for (i <- org)
  //  yield Random.nextInt(10)
  //
  //
  //println(c)
  //println(ex3_1(5))


}