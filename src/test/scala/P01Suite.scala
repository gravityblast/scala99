import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P01Suite extends FunSuite {
  import P01._

  test("returns the last element passing a valid list") {
    assert(last(List(1, 2, 3, 4)) === 4)
  }

  test("returns the last element passing a list with 1 element") {
    assert(last(List(3)) === 3)
  }

  test("throws exception with an empty list") {
    intercept[NoSuchElementException] {
      last(List())
    }
  }

  test("throws exception with passing nil") {
    intercept[NoSuchElementException] {
      last(Nil)
    }
  }
}
