name := """geonames-web-client-scala"""

version := "0.1"

scalaVersion := "2.11.8"

lazy val geonamesWebClientScala = project in file(".")

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"


unmanagedBase := baseDirectory.value / "lib"
