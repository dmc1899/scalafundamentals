/** String formatting in Scala using Java style */
val str = String.format("This is a %s", "Test") /** Replace %s with the word "Test", but this is a static method call. **/
println(str)


/** Scala gives us the ability to call a method on the string directly. */
val scala_str2 = "This is a %s".format("Scala String")
println(scala_str2)


val scala_str3 = "This is a boolean %B".format(1)
println(scala_str3)

val scala_str4 = "This is a decimal integer %d".format(89)
println(scala_str4)

val scala_str5 = "Because you're %3$s, %2$s, %1$s times a lady.".format("Three", "Twice", "Once")
println(scala_str5)




import java.time._ /** Import full library*/
println("We will be eating lunch on %1$tB the %1$te in the year %1$tY.".format(LocalDate.now))

/** we can achieve the same as the line above using: */
printf("We will be eating lunch on %1$tB the %1$te in the year %1$tY.\n.", LocalDate.now)


/** Using smart strings */
val smart_string = """I see trees of %s
@and %s roses too
@fat too
@fat is black""".stripMargin('@').format("green", "red")

println(smart_string)
