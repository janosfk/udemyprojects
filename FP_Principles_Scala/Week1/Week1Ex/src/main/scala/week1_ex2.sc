def guess : Double = 1
def x : Double = 2

def abs(x : Double) = if(x < 0) -x else x

def sqrtIter(guess:Double, x: Double) : Double =
 if(isGoodEnought(guess, x)) guess
 else sqrtIter(improve(guess, x), x)


//def isGoodEnought(guess: Double, x: Double) : Boolean =
// abs(guess * guess - x) < 0.001

def isGoodEnought(guess: Double, x: Double): Boolean =
 abs(guess * guess - x) < 0.001

// (x + x/y ) / 2
def improve(guess: Double, x: Double) : Double = (x + x / guess) / 2

def sqrt(x:Double) = sqrtIter(1.0, x)

//sqrt(2.0)
//sqrt(4.0)

