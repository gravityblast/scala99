// Reverse a list.
// Example:
// scala> reverse(List(1, 1, 2, 3, 5, 8))
// res0: List[Int] = List(8, 5, 3, 2, 1, 1)

object P05 {
  def reverse[A](items: List[A]): List[A] = {
    def f(from: List[A], to: List[A]): List[A] = from match {
      case Nil => to
      case _   => f(from.tail, from.head :: to)
    }
    f(items, Nil)
  }
}
