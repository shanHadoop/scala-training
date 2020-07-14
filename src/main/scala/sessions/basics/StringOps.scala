package sessions.basics

object StringOps extends App {

  val str: String = "Hello welcome to scala course"

  println(str.charAt(2)) //strings are zero indexed

  println(str.substring(7, 11)) //include 7 , exclude 11

  println(str.split(" ").toList)

  println(str.startsWith("Hello"))

  println(str.length)

  // scala specific operations

  println("2".toInt)

  println('a' +: "b") //prepending

  println("a":+'b') // appending

  // list like functions

  println(str.take(2))

  // string interpolaters

  // s interpolater

  val name = "John"
  val age = 12

  val greeting = s"Hello, my name is $name and I am $age years old"
  println(greeting)

  val complexGreeting = s"Hello my name is $name and I will be turning ${age +1} years old"
  println(complexGreeting)

  // f- interpolaters
  val speed = 5.5f
  val info = f"$name can run at at a speed of $speed%2.2f"
  println(info)

  // raw interpolaters

  println(raw"this is a \n new line") //this will be printed literally
  val rawString = "this is a \n new line"
  println(raw"$rawString")
}
