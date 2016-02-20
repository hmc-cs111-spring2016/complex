import dsls.complex.Complex

import scala.language.postfixOps

object Program extends App {
  import Complex._
  
  val c1 = Complex(1, 2)
  val c2 = 1.0
  println(c1 * c2)
  println(-c1)
  val s = (c1 -)
  println(i * i)
}