object VarQuestions extends  App {

  /*Part 1 --> Simply declare numInt as var*/
  val numInt: Int = 5
  println(numInt)
/*
  numInt = 10
  println(numInt)
*/

  /*Part 2 --> Not much useful in terms of functional programming, as no real computation is being done*
  / However, reassignment is useful in low level programming where reassignment can be used to save memory
   */
  var v1: Int = 5
  v1 = 10
  val constantv1 = v1

  /*Part 3* --> no value does not changed, since I did constantv1 assignment before reassignment of v1 */
  v1 = 15
  println(constantv1)

  /*Part 4 --> no value does not changed, since I did v2 assignment before reassignment of v1*/
  var v2 : Int = v1
  println(v2)
  v1 = 20
  println(v2)

}
