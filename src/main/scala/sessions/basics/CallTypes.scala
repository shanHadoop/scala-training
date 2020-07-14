package sessions.basics

import java.util.UUID

object CallTypes extends App {

  def calledByValue(x: String): Unit = {
    println("by value " + x)
    println("by value " + x)
  }


  def calledByName(x: => String): Unit = {
    println("by name " + x) //println("by name " + UUID.randomUUID().toString)
    println("by name " + x) //println("by name " + UUID.randomUUID().toString)
  }

  calledByValue(UUID.randomUUID().toString)
  calledByName(UUID.randomUUID().toString)


}
