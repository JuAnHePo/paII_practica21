import scala.language.postfixOps

object ejercicio1 {
  def primeFactors(n: Int): List[Int] = {
    @scala.annotation.tailrec
    def go(n: Int, divisor: Int, acc: List[Int]): List[Int] = {
      if n < 2 then acc
      else if n % divisor == 0 then go(n / divisor, divisor, acc :+ divisor)
      else go(n, divisor + 1, acc)
    }
    
    go(n, 2, Nil)
  }
  
  @main def mainPrimeFactors(): Unit = {
    println(primeFactors(60)) // Output: List(2, 2, 3, 5)
    println(primeFactors(97)) // Output: List(97)
    println(primeFactors(84)) // Output: List(2, 2, 3, 7)
  }
}
