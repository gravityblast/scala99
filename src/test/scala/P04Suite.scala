import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P04Suite extends FunSuite {
  import P04._

  test("returns list length") {
    assert(length(List(2, 4, 6, 8, 10)) === 5)
  }

  test("returns 1 passing a list with 1 element") {
    assert(length(List(8)) === 1)
  }

  test("returns 0 passing an empty list") {
    assert(length(List()) === 0)
  }
}
