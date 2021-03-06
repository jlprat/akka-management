import sbt._, Keys._

object Dependencies {

  val AkkaVersion = "2.4.18"
  val AkkaHttpVersion = "10.0.6"
  val junitVersion = "4.12"

  val Common = Seq(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.1" % Test // ApacheV2
    )
  )

  val ClusterHttp = Seq(
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-cluster"                      % AkkaVersion,
      "com.typesafe.akka" %% "akka-http"                         % AkkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-spray-json"              % AkkaHttpVersion,
      "io.spray"          %% "spray-json"                        % "1.3.2",                  // ApacheV2
      "com.typesafe.akka" %% "akka-http-testkit"                 % AkkaHttpVersion % "test",
      "junit"             % "junit"                              % junitVersion    % "test",
      "org.mockito"       % "mockito-all"                        % "1.10.19"       % "test"  // Common Public License 1.0
    )
  )
}
