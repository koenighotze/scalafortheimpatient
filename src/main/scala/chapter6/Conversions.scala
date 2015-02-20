package chapter6

/**
 * Created by dschmitz on 17.02.15.
 */


// Ex 6_1
object Conversions extends App {

  def inchesToCentimeters(inch: Double) = inch * 2.54

  def gallonsToLiters(gallons: Double) = gallons * 123

  def milesToKilometers(miles: Double) = miles * 1.54

  println(inchesToCentimeters(12))

}

