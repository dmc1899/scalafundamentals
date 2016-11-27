/** Functional For loop */
val xs = List(1,2,3,4)
var result = List[Int]() /** We want to avoid Vars */

for (a <- xs) {
	result = result :+ (a + 1)
}