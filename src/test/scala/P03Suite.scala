import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P03Suite extends FunSuite {
  import P03._

  test("return the nth element passing a valid list") {
    assert(nth(2, List(1, 2, 3, 4)) === 3)
    assert(nth(3, List(1, 2, 3, 4)) === 4)
  }

  test("throws an exception if pos is negative") {
    intercept [NoSuchElementException] {
      nth(-1, List(2,4,6))
    }
  }

  test("throws exception if pos is out of bounds") {
    intercept[NoSuchElementException] {
      nth(2, List(1))
    }
  }
}


