/** String interpolation in Scala */

val a = 99
println(s"${a} luftaballons floating in the summer sky") /** In order to use string interpolation, we need to include the prefix 's'*/

val ticketCost = 50
val bandName = "Nirvana"
println(f"The band $bandName%s have tickets going on sale for £$ticketCost%1.4f")

val percentIncrease = 20
val musicGenre = "New Wave"
println(f"The band $bandName%s have tickets going probably on sale for £$ticketCost%1.4f%nThat's a $percentIncrease%% bump because everyone likes $musicGenre%s")


/** Repeating the line above using Smart Strings */
println(f"""The band $bandName%s have tickets going probably on sale for £$ticketCost%1.4f
	|That's a $percentIncrease%% bump because everyone likes $musicGenre%s""".stripMargin)
