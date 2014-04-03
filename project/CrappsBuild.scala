import sbt._
import sbt.Keys._

object CrappsBuild extends Build {

  lazy val crapps = Project(
    id = "crapps",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Crapps",
      organization := "im.jeanfrancois",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.2"
      // add other settings here
    )
  )
}
