object ejercicio2 {
  def binarySearch(arr: Array[Int], elt: Int): Option[Int] = {
    @scala.annotation.tailrec
    def go(arr: Array[Int], elt: Int, inicio: Int, fin: Int): Option[Int] = {
      if elt == arr((inicio + fin) / 2) then Some((inicio + fin) / 2)
      else if inicio == fin then None
      else if elt < arr(fin / 2) then go(arr, elt, inicio, (fin / 2) - 1)
      else go(arr, elt, ((inicio + fin) / 2) + 1, fin)
    }

    go(arr, elt, 0, arr.length - 1)
  }

  @main def mainBinarySearch(): Unit = {
    val arr = Array(1, 3, 5, 7, 9, 11)
    println(binarySearch(arr, 5)) // Output: Some(2)
    println(binarySearch(arr, 10)) // Output: None
  }
}
