import java.util.{Locale, TimeZone}

TimeZone.getAvailableIDs()
  .filter(p => p.startsWith("America/"))
  .map(p => p.split("/")(1))
  .reverse






