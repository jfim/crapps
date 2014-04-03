package im.jeanfrancois.crapps

object LongLivedGarbageGenerator extends App {
  var i = 0

  while(true) {
    val garbage = new Garbage(i)
    GarbageAccumulator.addGarbage(garbage)

    i += 1
  }
}
