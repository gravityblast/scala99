// Find the Kth element of a list.
// By convention, the first element in the list is element 0.
// Example:

// scala> nth(2, List(1, 1, 2, 3, 5, 8))
// res0: Int = 2

object P03 {
  def nth[A](pos: Int, items: List[A]): A = (pos, items) match {
    case (0, h :: _)      => h
    case (pos, _ :: tail) => nth(pos - 1, tail)
    case (_, Nil)         => throw new NoSuchElementException
  }
}
