package NewtonAprox

object factorial extends  App {

  import scala.annotation.tailrec

  def fact(n: Int): Int =
    if (n == 0) 1 else n * fact(n - 1)

  println(fact(4))
  println(fact(3))

  @tailrec
  def facttailrec(n: Int, prod: Int): Int =
    if (n == 1) prod
    else facttailrec(n - 1, prod * n)

  println(facttailrec(4, 1))
}
