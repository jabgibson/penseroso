enablePlugins(ScalaJSPlugin)

name := "penseroso"
organization := "com.jabgibson"
version := "0.1.0-snapcrack"

scalaVersion := "2.13.5"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.1.0"
libraryDependencies += "com.raquo" %%% "airstream" % "0.12.0"
libraryDependencies += "com.raquo" %%% "laminar" % "0.12.1"

scalaJSUseMainModuleInitializer := true

