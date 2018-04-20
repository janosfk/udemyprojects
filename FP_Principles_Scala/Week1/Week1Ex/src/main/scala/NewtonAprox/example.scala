package NewtonAprox

object NewtonApprox1 extends App {
  println("started")

  def guess: Double = 1

  def x: Double = 2

  def abs(x: Double) = if (x < 0) -x else x

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnought(guess, x)) guess
    else sqrtIter(improve(guess, x), x)


  def isGoodEnought(guess: Double, x: Double): Boolean =
    abs(guess * guess - x) / x < 0.001

  // (x + x/y ) / 2
  def improve(guess: Double, x: Double) =
    (x / guess + guess) / 2

  def sqrt(x: Double): Double = sqrtIter(1.0, x)


  println(sqrt(2))
  println(sqrt(4))
  println(sqrt(1e-6))
  println(sqrt(1e60))
  println(sqrt(0.001))
}
