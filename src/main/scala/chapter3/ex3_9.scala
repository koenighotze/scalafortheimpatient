object Solutionex3_9 extends App {

  import java.util.TimeZone

  TimeZone.getAvailableIDs()
    .filter(p => p.startsWith("America/"))
    .map(p => p.split("/")(1))
    .reverse


}