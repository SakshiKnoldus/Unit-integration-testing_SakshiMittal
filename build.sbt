name := "TestingAssignment_Group2"

version := "1.0"

scalaVersion := "2.12.12"

//libraryDependencies += ("org.scalatest" %% "scalatest" % "3.2.2" % "test")

libraryDependencies +=("org.scalatest" %% "scalatest" % "3.0.8" % Test)

lazy val Company = project.in(file("Company"))
  .settings(libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.8" % Test,
    "org.mockito" %% "mockito-scala" % "1.5.12" % Test))