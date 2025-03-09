object ejercicio8 {
  def reduce[A](l: List[A], f: (A, A) => A): A = {
    require(l.nonEmpty, "La lista esta vacia.\n")
    @scala.annotation.tailrec
    def go(l: List[A], total: A): A = {
      if l.isEmpty then total
      else go(l.tail, f(total, l.head))
    }

    go(l.tail, l.head)
  }

  @main def mainReduce(): Unit = {
    println(reduce(List(1,2,3,4,5), _ + _))
  }
}