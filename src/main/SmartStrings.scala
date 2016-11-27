val lyrics_dumb_string = "I see trees or green and, \n" +
" Red roses too, \n" +
" I see them bloom, \n" +
" for me and you."
/**println(lyrics_dumb_string)*/

val smart_string = """I see trees of green
and red roses too
fat too
fat
fat"""
/**println(smart_string) */

val message = "Rat bag 999"
val regex = """([0-9])""".r
println(regex.findAllIn(message).toList)