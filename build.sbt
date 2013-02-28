import AssemblyKeys._

name := "Basic Project"

organization := "com.example"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)

initialCommands := "import com.example._"

assemblySettings