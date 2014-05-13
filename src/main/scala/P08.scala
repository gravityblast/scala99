// Eliminate consecutive duplicates of list elements.
// If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
// Example:

// scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
// res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)

object P08 {
  def compress(items: List[Symbol]): List[Symbol] = {
    def f(a: List[Symbol], b: List[Symbol]): List[Symbol] = a match {
      case h :: t => f(a.dropWhile(_ == h), h :: b)
      case Nil    => b.reverse
    }

    f(items, Nil)
  }
}
