package chapter5

/**
 * Created by dschmitz on 06.01.15.
 */
object Ex5_4 extends App {
  class Time(h : Int,  m : Int) {
    val time = h * 60 + m


    def hours = time / 60
    def minutes = time % 60

    def before(other : Time) = {
      time <= other.time
    }
  }


  val t = new Time(10, 4)
  println("H: " +t.hours)
  println("S: " + t.minutes)


  val s = new Time(9, 4)
  val u = new Time(10, 12)
  println(t.before(t))
  println(t.before(s))
  println(s.before(t))
  println(s.before(u))
  println(t.before(u))
  println(u.before(t))
}
