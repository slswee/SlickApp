
name := """play-scala-slick-postgres-example"""

version := "2.6.x"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.1"

libraryDependencies += guice

//libraryDependencies ++= Seq(
////  jdbc,
//  "org.postgresql" % "postgresql" % "9.3-1102-jdbc4"
//)

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-slick" % "5.0.0",
  "com.typesafe.play" %% "play-slick-evolutions" % "5.0.0"
)
libraryDependencies += specs2 % Test
  

