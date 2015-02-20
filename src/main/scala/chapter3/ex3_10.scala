object Solutionex3_10 extends App {

  import java.awt.datatransfer._

  import scala.collection.JavaConversions.asScalaBuffer

  val flavors = SystemFlavorMap
    .getDefaultFlavorMap
    .asInstanceOf[SystemFlavorMap]
  asScalaBuffer(flavors.getNativesForFlavor(DataFlavor.imageFlavor))
}