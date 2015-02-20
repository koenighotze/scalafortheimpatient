package chapter5

/**
 * Created by dschmitz on 07.01.15.
 */
class Car(val manufacturer: String, val modelName: String, val modelYear: Int, var plate: String) {

  def this(manufacturer: String, modelName: String) {
    this(manufacturer, modelName, -1, "")
  }

  def this(manufacturer: String, modelName: String, plate: String) {
    this(manufacturer, modelName, -1, plate)
  }

  def this(manufacturer: String, modelName: String, modelYear: Int) {
    this(manufacturer, modelName, modelYear, "")
  }

  override def toString = "Manu " + manufacturer + ", model " + modelName + ", year " + modelYear + ", " + plate
}

object CarTest extends App {
  println(new Car("manu", "model", 1999, "D-DS-8976"))
  println(new Car("manu", "model", 1984))
  println(new Car("manu", "model", "D-DS-9823"))
  println(new Car("manu", "model"))


}
