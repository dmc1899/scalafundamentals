def processNumbers(b:Boolean, x:Int, y:Int) = if (b) x else y

println(processNumbers( x= 10, y = 41, b = true)) /** This should return 10 */

def add(x:Int, y:Int = 10) = x + y
println(add(4,3)) /** Should return 7 */
println(add(50)) /** Should return 60 */