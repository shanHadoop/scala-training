package exercises.basics

import scala.annotation.tailrec

object Exercise extends App {

  /**
    * 1. A greeting function (name, age) => "Hi , my name is $name and my age is $age"
    */
  def greeting(name: String, age: Int): String = s""

  /**
    * 2. A factorial function
    */
  def factorial(n: Int): Int = {
    def doFact(n:Int,acc:Int):Int ={
      if (n == 0) acc
      else doFact(n-1,n * acc)
    }
    doFact(n,1)
  }


  /**
    * 3. Test if a number is prime
    */

  def isPrime(n: Int): Boolean = {
    @tailrec
    def checkPrime(inNum:Int, isPrimeNum:Boolean):Boolean = {
      if (inNum <= 1 ) isPrimeNum
      else checkPrime((inNum -1), (n % inNum != 0) && isPrimeNum)
    }
    checkPrime(n/2,true)
  }


  println(isPrime(8))
  println(isPrime(7))
}
