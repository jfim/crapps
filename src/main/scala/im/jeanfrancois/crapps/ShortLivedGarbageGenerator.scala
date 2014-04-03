package im.jeanfrancois.crapps

object ShortLivedGarbageGenerator extends App {
  var i = 0

  while(true) {
    val garbage = new Garbage(i)
    GarbageCounter.addGarbage(garbage)

    i += 1
  }
}
