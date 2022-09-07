ThisBuild / scalaVersion := "2.13.8"

libraryDependencies ++= Seq(
  dependencies.databricksJdbc,
  dependencies.slick,
  dependencies.alpakkaSlick
  )

lazy val dependencies = new {
  val slickVersion = "3.3.3"
  val alpakkaVersion = "3.0.4"

  val slick = "com.typesafe.slick" %% "slick" % slickVersion
  val databricksJdbc = "com.databricks" % "databricks-jdbc" % "2.6.29"
  val alpakkaSlick = "com.lightbend.akka" %% "akka-stream-alpakka-slick" % alpakkaVersion
}
