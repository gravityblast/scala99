import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P05Suite extends FunSuite {
  import P05._

  test("returns an empty list passing an empty list") {
    assert(reverse(List()) === List())
  }

  test("returns a list in reverse order") {
    assert(reverse(List(2, 4, 6, 8)) === List(8, 6, 4, 2))
  }
}

