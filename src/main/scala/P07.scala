// Flatten a nested list structure.
// Example:
// scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
// res0: List[Any] = List(1, 1, 2, 3, 5, 8)

object P07 {
  def flatten(items: List[Any]): List[Any] = items flatMap {
    case list: List[_] => flatten(list)
    case e => List(e)
  }
}
