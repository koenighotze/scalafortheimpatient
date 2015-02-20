package chapter6

/**
 * Created by dschmitz on 17.02.15.
 */
// Ex 6.2
abstract class UnitConversion {
  def convert(value: Double) = value * factor


  def factor: Double
}

object InchesToCentimeters extends UnitConversion {
  override def factor: Double = 1.54
}

object MilesToKilometers extends UnitConversion {
  override def factor: Double = 1.23
}

object GallonsToLiters extends UnitConversion {
  override def factor: Double = 1.2
}


object Ex62Test extends App {
  println(InchesToCentimeters.convert(12))
  println(GallonsToLiters.convert(12))
  println(MilesToKilometers.convert(12))
}
