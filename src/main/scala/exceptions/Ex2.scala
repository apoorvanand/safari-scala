package exceptions

import java.sql.SQLException

import scala.util.{Failure, Success, Try}

object Ex2 {
  def main(args: Array[String]): Unit = {
    val result = Try {
      if (math.random() > 0.5) {
        throw new SQLException("DB broke")
      } else if (math.random() > 0.5) {
        throw new RuntimeException("Bad stuff...")
      } else "Successful execution"
    }

    result match {
      case Success(s) => println(s"That worked and gave value ${s}")
      case Failure(f) => println(s"Broke with a ${f}")
    }

    println("Continuing...")
  }
}
