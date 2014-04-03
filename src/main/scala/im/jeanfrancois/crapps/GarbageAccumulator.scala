package im.jeanfrancois.crapps

object GarbageAccumulator {
  var lastGarbage: Garbage = null
  var lastGarbageId: Int = 0
  var garbageList = List.empty[Garbage]
  val runtime = Runtime.getRuntime

  def addGarbage(garbage: Garbage) {
    lastGarbage = garbage
    lastGarbageId = garbage.id
    if (runtime.freeMemory() < 10 * 1024) {
      garbageList = List.empty[Garbage]
    } else {
      garbageList = garbageList :+ garbage
    }
  }
}
