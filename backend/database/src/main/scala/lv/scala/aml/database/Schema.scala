package lv.scala.aml.database

import doobie.quill.DoobieContext.MySQL
import io.getquill.{CamelCase, MappedEncoding}
import io.getquill.context.jdbc.{Decoders, Encoders}

import java.time.Instant
import java.util.Date

trait Schema {
  val ctx: MySQL[CamelCase] with Decoders with Encoders
  implicit val instantDecoder: MappedEncoding[Date, Instant] = MappedEncoding[Date, Instant](_.toInstant)
  implicit val instanceEncoder: MappedEncoding[Instant, Date] = MappedEncoding[Instant, Date](Date.from)
}
