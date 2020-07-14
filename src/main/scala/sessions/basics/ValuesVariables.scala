package sessions.basics

object ValuesVariables extends App {

  val x : Int = 5

  println(x)

  //x = 10
  // VALS ARE IMMUTABLE

  val y = 5 // compiler infers types

  println(y)

  //types in Scala

  val string: String = "this is a string"
  val anotherString : String  = "another string"

  val boolean: Boolean  = true
  val char : Char = 'a'
  val int: Int = 12345678
  val short: Short = 1234 // represented by 2 bytes
  val long: Long = 1234567886766L //represented by 8 bytes
  val float: Float = 1.2f
  val double: Double = 3.14553

  // variables in scala
  var aVariable : Int = 19
  aVariable = 5 // side effect
}
