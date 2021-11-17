import sbt._

object Dependencies {

  private val scalaVersion = "2.13.7"
  private val akkaVersion = "2.6.17"
  private val akkaHttpVersion = "10.2.7"
  private val catsVersion = "2.6.1"
  private val catsEffectVersion = "2.5.4"
  private val http4sVersion = "0.21.25"
  private val scalaTestVersion = "3.2.10"
  private val scalaMockVersion = "5.1.0"
  private val circeVersion = "0.14.1"
  private val circeConfig = "0.8.0"
  private val doobieVersion = "0.9.4"
  private val slf4jVersion = "1.7.32"
  private val logbackClassic = "1.2.7"
  private val pureConfigVersion = "0.17.0"

  object Akka {
    val ActorTyped = "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion
    val ActorTestKitTyped = "com.typesafe.akka" %% "akka-actor-teskit-typed" % akkaVersion

    val Http = "com.typesafe.akka" %% "akka-http" % akkaHttpVersion
    val HttpTestKit = "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion

    val StreamTyped = "com.typesafe.akka" %% "akka-stream-typed" % akkaVersion
    val StreamTestKit = "com.typesafe.akka" %% "akka-steam-testkit" % akkaVersion
  }

  object Cats {
    val CatsCore = "org.typelevel" %% "cats-core" % catsVersion
    val CatsEffect = "org.typelevel" %% "cats-effect" % catsEffectVersion
  }

  object Circe {
    val CirceCore = "io.circe" %% "circe-core" % circeVersion
    val CirceGeneric = "io.circe" %% "circe-generic" % circeVersion
    val CirceConfig = "io.circe" %% "circe-config" % circeConfig
  }

  object Database {
    val DoobieCore = "org.tpolecat" %% "doobie-core" % doobieVersion
    val DoobieH2 = "org.tpolecat" %% "doobie-h2" % doobieVersion
    val DoobieHikari = "org.tpolecat" %% "doobie-hikari" % doobieVersion
    val DoobieSpec = "org.tpolecat" %% "doobie-specs2" % doobieVersion
  }

  object Http4s {
    val BlazeServer = "org.http4s" %% "http4s-blaze-server" % http4sVersion
    val BlazeClient = "org.http4s" %% "http4s-blaze-client" % http4sVersion
    val Circe = "org.http4s" %% "http4s-circe" % http4sVersion
    val Dsl = "org.http4s" %% "http4s-dsl" % http4sVersion
  }

  object Logging {
    val Sl4j = "org.slf4j" % "slf4j-api" % slf4jVersion
    val LogBack = "ch.qos.logback" % "logback-classic" % logbackClassic
  }

  object PureConfig {
    val Core = "com.github.pureconfig" %% "pureconfig" % pureConfigVersion
    val CatsEffect = "com.github.pureconfig" %% "pureconfig-cats-effect" % pureConfigVersion
  }

  object ScalaTest {
    val WordSpec = "org.sclatest" %% "scalatest-wordspec" % scalaTestVersion
    val ShouldMatchers = "org.scalatest" %% "scalatest-shouldmatchers" % scalaTestVersion
  }
}