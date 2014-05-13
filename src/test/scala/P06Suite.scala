import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P06Suite extends FunSuite {
  import P06._

  test("returns true passing a palindrome list") {
    assert(isPalindrome(List(1, 2, 3, 2, 1)))
  }

  test("returns false passing a non-palindrome list") {
    assert(!isPalindrome(List(1, 2, 3, 4, 5)))
  }
}


