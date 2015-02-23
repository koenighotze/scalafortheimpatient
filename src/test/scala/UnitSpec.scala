package scalafortheimpatient

import org.scalatest._

/**
 * Created by dschmitz on 22.02.15.
 */
abstract class UnitSpec
  extends FlatSpec
  with Matchers
  with OptionValues
  with Inside
  with Inspectors