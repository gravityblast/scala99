import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P10Suite extends FunSuite {
  import P10._

  test("Run-length encoding of a list") {
    val result = encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    val expected =  List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    assert(result == expected)
  }
}

