object P01 {
  def last(items: List[Int]): Int = items match {
    case h :: Nil  => h
    case _ :: tail => last(tail)
    case Nil       => throw new NoSuchElementException
  }
}
