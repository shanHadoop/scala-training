package sessions.basics

object DefaultArgs extends App {

  //Scala provides the ability to give parameters default values
  // that can be used to allow a caller to omit those parameters.

  def log(message: String, level: String = "INFO") = println(s"$level: $message")

  log("System starting")  // prints INFO: System starting
  log("User not found", "WARNING") // prints WARNING: User not found

  //However, if the leading parameters are with default values they cannot be emitted.

  def log1(level: String = "INFO", message: String) = println(s"$level: $message")

  //log1("System starting")  // does not compile, says missing parameter message

  // this can be fixed by using named arguments
  log1(message = "System starting") //the message arguments is named.

}
