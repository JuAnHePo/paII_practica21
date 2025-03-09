object ejercicio7 {
  def groupBy[A,B](l: List[A], f: A => B): Map[B, List[A]] = {
    @scala.annotation.tailrec
    def go(l: List[A], m: Map[B, List[A]]): Map[B, List[A]] = {
      if l.isEmpty then m
      else
        val key = f(l.head)
        val updatedList = m.getOrElse(key, Nil) :+ l.head
        go(l.tail, m + (key -> updatedList))
    }

    go(l, Map.empty)
  }

  @main def mainGroupBy(): Unit = {
    println(groupBy(List(1, 2, 3, 4, 5), _ % 2 == 0))
    // Output: Map(false -> List(5, 3, 1), true -> List(4, 2))
  }
}
