// 10
def x_power_n(x: Double, n: Int) : Double = {
  if (n == 0) 1
  else if (n < 0) x_power_n(1/x, n * -1 )
  else if (n % 2 == 1) x * x_power_n(x, n - 1)
  else {
    val y = x_power_n(x, n / 2)
    y * y
  }
}


println ("Result is " +x_power_n(4, 2))

println("try " + x_power_n(2, 10))

// 2
//