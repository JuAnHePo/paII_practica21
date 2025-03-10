object ejercicio5 {
  def filter[A](l: List[A], f: A => Boolean): List[A] = {
    @scala.annotation.tailrec
    def go(l: List[A], newL: List[A], f: A => Boolean): List[A] = {
      if l.isEmpty then newL
      else if f(l.head) then go(l.tail, newL :+ l.head, f)
      else go(l.tail, newL, f)
    }

    go(l, Nil, f)
  }

  @main def mainFilter(): Unit = {
    println(filter(List(1, 2, 3, 4, 5), _ % 2 == 0)) // Output: List(2,4)
  }
}
