package im.jeanfrancois.crapps

object GarbageCounter {
  var lastGarbage: Garbage = null
  var lastGarbageId: Int = 0

  def addGarbage(garbage: Garbage) {
    lastGarbage = garbage
    lastGarbageId = garbage.id
  }
}
