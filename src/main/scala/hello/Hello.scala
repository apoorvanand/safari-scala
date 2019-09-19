package hello

object Hello { // public is not a keyword, it's the default
  def +-+(x: Int): Int = x + 3
  def nothingness:Unit = {
    println("invoking nothingness")
    () // the Unit literal!!!
    // LAST expression in a "block" is the value of that block
    // don't usually use "return"
  }
  def main(args:Array[String]):Unit = {
    println("Hello, Scala world!")

//    var x = "heloo" //stylistically val is preferred!
//    x = "no, actually goodbye"
    val x = "heloo" //stylistically val is preferred!
    val changed = "no, actually goodbye"
//    println("the value of x is " + x)
    println(s"the value of x is ${x}")
    var y: Int = 99 // inferred Int
//    y = "Hello" // strongly statically typed
    y = y.+(3) // operator !!! and Scala operator overloading
    y = y + 3 // infix mode?? !!
//    val t = Hello.+-+(6)
    val t = Hello +-+ 6 // syntactic sugar "infix mode"
    println(s"value of t is ${t}")

    Console.println("Hello again")
    Console println "Hello again"
    println(nothingness)
  }
}

object PlayWithArrays {
  def main(args: Array[String]): Unit = {
    println("Hello again....")

//    val names: Array[String] = Array("Fred", "Jim", "Sheila")
//    val names = Array[String]("Fred", "Jim", "Sheila")
    val names = Array("Fred", "Jim", "Sheila")
    println(s"the first name is ${names(0)}")
    names(1) = "Jimmy"
    println(s"Jim is now ${names(1)}")
  }
}