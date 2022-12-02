ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.1"

lazy val root = (project in file("."))
  .settings(
    name := "project-challenge"
  )

libraryDependencies += ("com.storm-enroute" %% "scalameter" % "0.21" % Test)
  .withCrossVersion(CrossVersion.for3Use2_13 )
