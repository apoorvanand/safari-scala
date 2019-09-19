package liststuff

object UseLists {
  def main(args: Array[String]): Unit = {
    val names = List("Fred", "Jim", "Sheila")
    println(s"first name is ${names(0)}")
//    val moreNames = names.::("Bill") // :: means "prepend"
        val moreNames = "Bill" :: names // RIGHT Associative as infix
    val nums = 1 :: 2 :: 3 :: 5 :: 8 :: Nil

    println(s"Head of nums is ${nums.head}")
    println(s"Rest of nums after head (tail) is ${nums.tail}")
   }
}
