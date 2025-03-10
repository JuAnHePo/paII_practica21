object ejercicio6 {
  def map[A,B](l: List[A], f: A => B): List[B] = {
    @scala.annotation.tailrec
    def go(l: List[A], newL: List[B], f: A => B): List[B] = {
      if l.isEmpty then newL
      else go(l.tail, newL :+ f(l.head), f)
    }
    
    go(l, Nil, f)
  }

  @main def mainMap(): Unit = {
    println(map(List(1,2,3,4,5), _ * 2)) // Output: List(2,4,6,8,10)
  }
}
