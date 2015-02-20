package chapter5

/**
 * Created by dschmitz on 06.01.15.
 */
object Ex5_3 extends App {

  class Time(val hours: Int, val minutes: Int) {

    override def toString = hours + ":" + minutes

    def before(other: Time) = {
      if (other.hours < hours) false
      else if (other.hours > hours) true
      // hours are equal
      else if (other.minutes < minutes) false
      else
        true
    }
  }

  val t = new Time(10, 4)
  println(t)
  println("H: " + t.hours)
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
