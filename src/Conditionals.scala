object Conditionals extends App {

  /*Part 1*/
  val (a,b) = (1,5)
  val maxOfTwo ={
    if (a > b) {
      println("a is not less than b")
    }
    if (a == b){
      println("a and b are equal")
    }
    else {
      println("a is less than b")
    }
  }

  /*Part 2*/
  val greaterThanTwo = {
    if (a > 2 && b > 2 ){
      println("a and b both are greater than two")
    }
    if (a < 2 && b < 2 ){
      println("a and b both are less than two")
    }
    if (a == 2 && b == 2 ){
      println("a and b both are equal to two")
    }
    if (a > 2 | b > 2 ){
      println("Either a or b both is greater than two")
    }
  }

  /*Part 3*/
  val c = 5
  val LessThanC ={
    if (a < c) {
      println("a is less than c")
    }
    if (a == c | b == c){
      println("a or b is equal to c")
    }
    if (b < c){
      println("b is less than c")
    }
    else {
      println("a and b are greater than c")
    }
  }

  /*Part 4*/
  val distance = 9
  val activity = "biking"

  val willDo = {
    if(activity == "running") {
      distance < 10
    } else if(activity == "biking") {
      distance < 20
    } else if(activity == "walking") {
      distance < 6
    } else {
      false
    }
  }

  println(activity + ": " + willDo)

  /*Part 5-->0,1,1,2,3,5,8*/
  

}
