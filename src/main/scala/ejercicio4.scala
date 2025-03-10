object ejercicio4 {
  def zip[A,B](la: List[A], lb: List[B]): List[(A, B)] = {
    @scala.annotation.tailrec
    def go(la: List[A], lb: List[B], l: List[(A,B)]): List[(A,B)] = {
      if la.isEmpty || lb.isEmpty then l
      else go(la.tail, lb.tail, l :+ (la.head, lb.head))
    }

    go(la, lb, Nil)
  }

  @main def mainZip(): Unit = {
    println(zip(List(10, 20, 30), List('a', 'b', 'c'))
      == List((10, 'a'), (20, 'b'), (30, 'c')))
    println(zip(List(10, 20, 30), List('a', 'b'))
      == List((10, 'a'), (20, 'b')))
  }
}
