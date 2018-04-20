package NewtonAprox

object NewtonApprox2 extends App {

  def sqrt(x: Double): Double = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnought(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnought(guess: Double): Boolean =
      abs(square(guess) - x) / x < 0.001

    // (x + x/y ) / 2
    def improve(guess: Double) =
      (x / guess + guess) / 2

    sqrtIter(1.0)
  }

  def square(z: Double) = z * z
  def abs(x: Double) = if (x < 0) -x else x

  println(sqrt(2))
  println(sqrt(4))
  println(sqrt(1e-6))
  println(sqrt(1e60))
  println(sqrt(0.001))

}


//println(sqrt(2))
//println(sqrt(4))
//println(sqrt(1e-6))
//println(sqrt(1e60))
//println(sqrt(0.001))