```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Correct usage of foldLeft with immutability
  val correctSum = list.foldLeft(0)(_ + _)
  println(s"Sum using foldLeft with immutability: $correctSum") //Output: 15

  //Alternative solution using sum method
  val sum = list.sum
  println(s"Sum using sum method: $sum") //Output: 15
}
```