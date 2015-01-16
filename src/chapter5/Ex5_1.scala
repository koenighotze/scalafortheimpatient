package chapter5

/**
 * Created by dschmitz on 30.12.14.
 */
object Ex5_1 extends App {
  class Counter(start:Int) {
    private var value = start

    def current = value

    def inc() = if (value < Int.MaxValue) value += 1

    override def toString = "Counter at " + this.current
  }


  val c = new Counter(Int.MaxValue)
  println(c)
  c.inc()
  println(c)


}
