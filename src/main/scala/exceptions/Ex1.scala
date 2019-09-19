package exceptions

import java.sql.SQLException

object Ex1 {
  def main(args: Array[String]): Unit = {
    try {
      if (math.random() > 0.5) {
        throw new SQLException("DB broke")
      } else if (math.random() > 0.5) {
        throw new RuntimeException("Bad stuff...")
      }
    } catch {
      case x:SQLException => println(s"That broke ${x}")
      case _:Throwable => println("Strange error!")
    }

    println("Continuing...")
  }
}
