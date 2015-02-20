// 1
object Chapter2_Ex1 extends App {
  def signum(i: Int): Int = if (i < 0) -1
  else if (i > 0) 1
  else 0

  signum(-10)
  signum(10)

  // 2
  {}

  // 3
  //var y = 1
  var y = 0

  def x = y = 1

  println("x is " + x)

  // 4
  for (i <- 10.to(0, -1)) println(i)

  // 5
  def countdown(n: Int) = for (c <- n.to(0, -1)) println(c)

  countdown(5)


  // 6
  def unicodeProductLoop(s: String): Long = {
    var res = 1L
    for (c <- s) {
      res = res * c.toLong
    }
    res
  }

  unicodeProductLoop("Hello") == 9415087488L

  // 7
  def unicodeProduct(s: String): Long = s.map(c => c.toLong).foldLeft(1L)((r, i) => r * i)

  unicodeProduct("Hello") == 9415087488L

  // 8 ...done


  //9
  def recursiveProd(s: String): Long = {
    if (s.isEmpty) 1
    else s.head.toLong * recursiveProd(s.tail)

  }

  recursiveProd("Hello") == 9415087488L


}
