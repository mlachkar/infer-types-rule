package fix

object ExplicitResultTypesSingleton {
  implicit val default: fix.ExplicitResultTypesSingleton.type = ExplicitResultTypesSingleton
  implicit val singleton: fix.ExplicitResultTypesSingleton2.Singleton.type = ExplicitResultTypesSingleton2.Singleton
}
object ExplicitResultTypesSingleton2 {
  object Singleton
}
