import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P07Suite extends FunSuite {
  import P07._

  test("flatten a nested list") {
    val a = (List(List(1, 1), 2, List(3, List(5, 8))))
    val b = List(1, 1, 2, 3, 5, 8)
    assert(flatten(a) === b)
  }
}
