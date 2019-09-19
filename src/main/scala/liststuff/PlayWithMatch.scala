package liststuff

object PlayWithMatch {
  def main(args: Array[String]): Unit = {
    val x: Any = 70

    x match {
      case 1 => println("I saw one")
      case 4 => println("I saw four")
      case y:Int if y < 50 => println(s"some other small number: ${y}")
      case y:String => println(s"I picked up ${y}" )
      case _ => println("Something else")
    }

/*
    // JAVA!!!
    Object obj = "Fred";
    if (obj instanceof String) {
      String s = (String)obj;
      // do string stuff...
    }
*/
  }
}
