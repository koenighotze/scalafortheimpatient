def swapper(input: Array[Int]) : Array[Int] = {
  for (i <- 0 to(input.length, 2)) {
    if (i + 1 < input.length) {
      val orig = input(i)
      input.update(i, input(i + 1))
      input.update(i + 1, orig)
    }
  }
  input
}

swapper(Array(1, 2))
swapper(Array(1, 2, 3))
swapper(Array(1, 2, 3, 4))
swapper(Array(1, 2, 4, 5 ,6))


def swapper2(input: Array[Int]) : Array[Int] = {
  for {
    i <- 0 to(input.length, 2)
    if i + 1 < input.length
  } yield {
    val orig = input(i)
    input.update(i, input(i + 1))
    input.update(i + 1, orig)
  }
  input
}

swapper2(Array(1, 2))
swapper2(Array(1, 2, 3))
swapper2(Array(1, 2, 3, 4))
swapper2(Array(1, 2, 4, 5 ,6))