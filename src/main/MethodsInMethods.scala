/** Testing method defined inside another method */
import scala.annotation.tailrec



def factorial(n:Int) = {
	@tailrec /** This is a package reference, quite often the reverse domain name of the company that created the code.*/
	def fact(n:BigInt, acc:BigInt):BigInt = {
	if (n == 0 || n ==1 ) acc
	else (fact(n - 1, acc * n))
	}

	fact(n,1)
}
println(factorial(5))
println(factorial(11))
println(factorial(1100))