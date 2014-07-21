// P09 (**) Pack consecutive duplicates of list elements into sublists.
//     If a list contains repeated elements they should be placed in separate
//     sublists.
//
//     Example:
//     scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//     res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))

object P09 {
  def pack[A](items: List[A]): List[List[A]] = {
    def f(items: List[A], acc: List[List[A]]): List[List[A]] = {
      if (items == Nil) {
        acc
      } else {
        val (packed, list) = items.span(_ == items(0))
        f(list, acc :+ packed)
      }
    }

    f(items, Nil)
  }
}

