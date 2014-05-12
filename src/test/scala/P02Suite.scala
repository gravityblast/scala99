import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P02Suite extends FunSuite {
  import P02._

  test("return the penultimate element passing a valid list") {
    assert(penultimate(List(1, 2, 3, 4)) === 3)
  }

  test("throws an exception if list has less than 2 elements") {
    intercept [NoSuchElementException] {
      penultimate(List(1))
    }
  }

  test("throws exception with an empty list") {
    intercept[NoSuchElementException] {
      penultimate(List())
    }
  }

  test("throws exception with passing nil") {
    intercept[NoSuchElementException] {
      penultimate(Nil)
    }
  }
}

