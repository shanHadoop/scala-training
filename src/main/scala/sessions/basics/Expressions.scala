package sessions.basics

object Expressions extends App {

  val x = 1+2 // the right hand side is called an expression
  println(x)

  println(2+3*4) // math expression follow the BODMAS order
  //  + - / * & | ^ << >> >>> (right shift with zero exntesion)

  println(1==1) //relational expression
  // ==  != > >= < <=

  println(!(1==1)) // boolean expressions
  // ! && ||

  // INSTRUCTIONS(DO) VS EXPRESSIONS(VALUE)

  //IF EXPRESSION
  val someCondition = false
  val conditionalValue = if(someCondition) "foo" else "bar"
  println(conditionalValue)

  //use expression as is
  println(if(someCondition) "foo" else "bar")

  //loops in scala
  //although loops are present , we are not encouraged to use them because loops
  // only execute side effects and do not return anything meaningful

  var i  = 0
  while(i < 10)  {
    println(i)
    i +=  1
  }

  // THIS IS DISCOURAGED IN PROFESSIONAL CODE BASES

  // EVERYTHING IN scala is an expression
  //even side effects like reassignment to a val , just that it does not return anything meaningful

  var y = 4

  // Introduce unit
  val notUsable = ( y = 5) //Unit === void
  println(notUsable)

  // examples of side effects are println(), while, reassignment.
  // side effects are expressions that return unit
  // side effects are reminder of imperative programming , they are like instructions but in scala even
  // these are expressions that return unit

  // CODE Blocks
  // surrounded by curly braces and inside we can write code

  val block = {
    val x = 1
    val y = x+1
     if(y==1)  "2" else "not 2"
  }

  //code blocks are expressions
  // value of the code block is the value of its last expression
  // values and variables defined inside the code block remain visible only inside the code block

}
