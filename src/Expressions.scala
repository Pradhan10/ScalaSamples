object Expressions extends App {

  /*Part 1 --> Expression is a unit of code that returns a value after it has been executed*/
  val feetPerMile = {
    5280
  }
  println(feetPerMile)

  /*Part 2*/
  val yardsPerMile = {
    feetPerMile / 3.0
  }
  println(yardsPerMile)

  /*Part 3*/
  val miles = {
    2000 / yardsPerMile
  }
  println(miles)


  /*Part 4*/
  val feetPerMile2 = {
    2000 / (5280 / 3.0)
  }
  println(feetPerMile2)


}
