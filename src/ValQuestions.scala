import java.lang.annotation.Documented

object ValQuestions extends App {

  /*Part 1*/
  val num: Int = 5
  println(num)

  /*Part 2*/
  val str: String = "ABC1234"
  println(str)

  /*Part 3*/
  val anotherNum: Double = 5.4
  println(anotherNum)

  /*Part 4*/
  val bool: Boolean = true
  println(bool)

  /*Part 5*/
  val multiLineString: String = """
                                 When we consider the fact that nearly three-quarters of the
                                 surface of the globe is covered by oceanic water, we begin to realise
                                 that the molecular scattering of light in liquids may possess an astronomical significance,
                                 in fact contribute in an important degree to the observed albedo of the earth.
                                  """
  println(multiLineString)

  /*Part 6 --> Gives us compile time error*/
  //val boolAgain:Boolean = "maybe"

  /*Part 7 --> Gives us compile time error*/
  //val numAgain: Int = 15.4

  /*Part 8 --> Gives us compile time error*/
  val numDouble: Double = 15
  println(numDouble)

}
