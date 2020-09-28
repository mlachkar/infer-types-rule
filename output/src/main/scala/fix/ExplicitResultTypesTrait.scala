package fix

object ExplicitResultTypesTrait {
  trait Trait {
    def foo: Map[Int, String]
    def message: CharSequence
  }

  object Overrides extends Trait {
    val foo: scala.collection.immutable.Map[Int,Nothing] = Map.empty
    val message: String = s"hello $foo"
  }
}
