name := """makanfriends"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.21",
 "com.typesafe.play" %% "play-json" % "2.3.4",
  javaJdbc,
  cache,
  javaWs
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

lazy val myProject = (project in file(".")).enablePlugins(PlayJava, PlayEbean)


fork in run := true