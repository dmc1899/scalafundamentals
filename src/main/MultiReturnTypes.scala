
/** Example below returns either and int or a string based on input parameters.
This function will have a return type defined as Any, as it is the base class which is parent for all ints and strings */
def add(x:Int, y:Int) = {if (x > 10) (x+y).toString else x + y }