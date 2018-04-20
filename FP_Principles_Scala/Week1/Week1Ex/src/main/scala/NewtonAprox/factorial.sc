import scala.annotation.tailrec

def fact(n: Int): Int =
  if (n == 0) 1 else n * fact(n - 1)

fact(4)
fact(3)

@tailrec
def facttailrec(n: Int, prod: Int): Int =
  if (n == 1) prod
  else facttailrec(n - 1, prod * n)

facttailrec(4,1)