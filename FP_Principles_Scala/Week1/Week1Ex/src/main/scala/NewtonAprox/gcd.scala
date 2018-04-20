package NewtonAprox

import scala.annotation.tailrec

object gcd extends App {

  def gcd(a: Int, b: Int): Int =
    if (b == 0) a
    else gcd(b, a % b)

  println(gcd(84, 18))
  println(gcd(16, 12))

  @tailrec
  def gcdtailrec(a: Int, b: Int): Int =
    if (b == 0) a
    else gcdtailrec(b, a % b)

  println("Using Tailrec:")
  println(gcdtailrec(84, 18))
  println(gcdtailrec(16, 12))

}
