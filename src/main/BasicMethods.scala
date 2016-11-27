/** Basic methods, inefficient example */


/** String way of defining methods */
def add(x:Int, y:Int):Int = {
	return x+ y
}

println(add(6,7))


def add2(x:Int, y:Int):Int = {x+ y}

println(add2(6,9))

def numberStatus(a:Int):String = {
	if (a < 10) "Less than 10"
	else if (a > 10) "Greater than 10"
	else "It is 10!"
}

println(numberStatus(40))