import scala.language.postfixOps

object ejercicio3 {
  def unzip[A,B](l: List[(A,B)]): (List[A], List[B]) = {
    @scala.annotation.tailrec
    def go(l: List[(A,B)], la: List[A], lb: List[B]): (List[A],List[B]) = {
      if l.isEmpty then (la, lb)
      else go(l.tail, la :+ l.head(0), lb :+ l.head(1))
    }

    go(l, Nil, Nil)
  }

  @main def mainUnzip(): Unit = {
    println(unzip(List((10, 'a'), (20, 'b'), (30, 'c')))
      == (List(10, 20, 30),List('a', 'b', 'c')))
  }
}
