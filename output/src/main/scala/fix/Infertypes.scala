package fix

object Infertypes {
  val valeur: String = "juste du text"
  val k: Int = 1
  val int: Int = 1
  val listOfString: scala.collection.immutable.Seq[String] = Seq("string")
  val duration: scala.concurrent.duration.FiniteDuration = scala.concurrent.duration.Duration.Zero

  case class User(firstName: String, lastName: String)
  val ml: fix.Infertypes.User = User("Meriam", "Lachkar")
}