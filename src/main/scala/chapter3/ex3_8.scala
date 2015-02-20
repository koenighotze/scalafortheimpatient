object Solutionex3_8 extends App {

  import scala.collection.mutable.ArrayBuffer

  def get_neg_indices(a: ArrayBuffer[Int]) = {
    for (
      i <- 0 to a.length - 1;
      if a(i) < 0
    ) yield i
  }

  val a = ArrayBuffer(1, -32, 23, 1, -24, -12, 5, 8)


  for (i <- get_neg_indices(a).reverse.dropRight(1)) {
    a.remove(i)
  }
  println(a)


}
