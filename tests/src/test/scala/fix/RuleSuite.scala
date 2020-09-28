package fix

import org.scalatest.FunSuiteLike
import scalafix.testkit._

class RuleSuite extends AbstractSemanticRuleSuite with FunSuiteLike {
  val (passing, failing) = testsToRun.partition(!_.path.testName.contains("_fails"))

  passing.foreach(runOn)

  // for running only one test if using Intellij
  def runOnSpecificTest(name: String): Unit = {
    testsToRun.filter(_.path.testName.contains(name)).foreach(runOn)
  }
}
