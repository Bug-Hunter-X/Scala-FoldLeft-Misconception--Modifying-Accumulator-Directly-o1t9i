```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Incorrect usage of foldLeft with a mutable variable
  var sum = 0
  list.foldLeft(sum)((acc, elem) => {
    acc += elem // Modifying acc directly doesn't work as expected
    acc
  })
  println(s"Sum using foldLeft with mutable variable: $sum") //Output: 0

  // Correct usage of foldLeft with immutability
  val correctSum = list.foldLeft(0)(_ + _)
  println(s"Sum using foldLeft with immutability: $correctSum") //Output: 15
}
```