name := "neo4j-scala"

version := "0.2.0-M2-SNAPSHOT"

scalaVersion := "2.10.1"

resolvers ++= Seq(
    "fakod-snapshots" at "https://raw.github.com/FaKod/fakod-mvn-repo/master/snapshots")

libraryDependencies ++= Seq(
    "junit" % "junit" % "4.7",
    "org.specs2" % "specs2_2.10" % "1.+",
    "org.specs2" % "specs2-scalaz-core_2.10" % "6.+",
    "org.neo4j" % "neo4j-kernel" % "2.+",
    "org.neo4j" % "neo4j-lucene-index" % "2.+",
    "org.neo4j" % "neo4j-shell" % "2.+",
    "org.neo4j" % "neo4j-cypher" % "2.+",
    "org.scala-lang" % "scala-compiler" % "2.10.1")

