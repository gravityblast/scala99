object P01 {
  def last[A](items: List[A]): A = items match {
    case h :: Nil  => h
    case _ :: tail => last(tail)
    case Nil       => throw new NoSuchElementException
  }
}
