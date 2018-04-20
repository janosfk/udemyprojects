def and(x:Boolean, y: => Boolean): Boolean = if (x) y else false

def loop: Boolean = loop

and(true, true)
and(true, false)
and(false, true)
//and(true, loop)
and(false, loop)    //cal by name loop




