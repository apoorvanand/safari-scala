package liststuff

object MatchOnLists {
  def main(args: Array[String]): Unit = {
    val names = List("Bill", "Fred", "Jim", "Sheila")

    names match {
      case List(a, b, c) => println(s"three elements third is ${c}")
//      case (h:String) :: t => println(s"list head is ${h}, tail is ${t}")
      case h :: t => println(s"list head is ${h}, tail is ${t}")
    }
  }
}
