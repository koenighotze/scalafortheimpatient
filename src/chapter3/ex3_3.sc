def swapper(input: Array[Int]) : Array[Int] = {
  val res = for {
    i <- 0 to input.length - 1
  } yield {
    if (i % 2 == 0) {
      if (i < input.length - 1) {
        input(i + 1)
      }
      else {
        input(i)
      }
    }
    else {
      input(i  - 1)
    }
  }
  res.toArray
}



//val s = for (i <- 1 to 10)  yield  i
//
//println(s)
//
//s.toArray

swapper(Array(1, 2))
swapper(Array(1, 2, 3))
swapper(Array(1, 2, 3, 4))
swapper(Array(1, 2, 4, 5 ,6))