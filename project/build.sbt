name := """project"""
organization := "com.company"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  guice,
  evolutions,
  jdbc,
  "com.h2database" % "h2" % "1.4.192",
  "org.im4java" % "im4java" % "1.4.0"
)