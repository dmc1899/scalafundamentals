/** Var implies this is mutable */
var a = 0
def sideEffect():Unit = {
	a = a + 1
}

println(a)