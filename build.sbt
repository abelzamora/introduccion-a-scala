lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "es.hablapps",
      name := "introduccionAScala",
      scalaVersion := "2.12.1",
      version      := "1.0.0-SNAPSHOT",

      javacOptions ++= Seq("-source", "1.8", "-target", "1.8")
    )),

    libraryDependencies ++= Seq(
      "junit" % "junit" % "4.12" % "test",
      "com.novocode" % "junit-interface" % "0.11" % "test",
      "org.scalatest" %% "scalatest" % "3.0.5"
    )
  )
