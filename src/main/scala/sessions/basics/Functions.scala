package sessions.basics

object Functions extends App {

  def fun(a: Int, b: String): String =
    a + " " + b

  def fun1(a: Int, b: String) = {
    a + " " + b
  }

  //functions are expressions and they have a value
  println(fun(1, "hello"))

  def paramLess() : Int = 42

  println(paramLess())
  println(paramLess)

  //avoid loops and use functions
  def repeat(str: String, times: Int): String = {
    if(times==1) str
    else str + repeat(str, times-1)
  }

  println(repeat("hello",3))

  // Using unit as return types
  def sideEffectFunction(str: String): Unit =
    println(str)

  sideEffectFunction("side effect")

  // Just like code blocks can have value and variable definitions
  // they can also have function definitions

  def codeBlock = {

    def inside = {
      42
    }

    inside + 1
  }

  println(codeBlock)
}
