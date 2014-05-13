import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P08Suite extends FunSuite {
  import P08._

  test("eliminates consecutive duplicates") {
    val result = compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    assert(result == List('a, 'b, 'c, 'a, 'd, 'e))
  }
}
