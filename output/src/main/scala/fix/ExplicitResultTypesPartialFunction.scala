package fix

object PartialFunction {
  def empty[A, B]: PartialFunction[A,B] = scala.PartialFunction.empty[A, B]
}
