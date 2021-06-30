/*
  Scala variables have to be declared and initialized, just like Java.
  However, Scala differentiates between mutable and *immutable* variables;
  an immutable variable cannot be changed once it's been initialized.
*/

var variable = "Declaring a mutable string variable"
variable = "Notice that variables can be reassigned"

/*
  1. What is the error with the following line of code?
  Comment out the line afterward.
*/
variable = 3

val variable2 = "Declaring an immutable string variable"

/*
  2. What is the error with the following line of code?
  Comment out the line afterward.
*/
variable2 = "What happens if we try to reassign a value?"

/*
  3. We often refer to `val`s as values, rather than variables.
  What are the advantages and disadvantages of using a value instead of a variable?
*/

/*
  4. Like Python, everything in Scala is structured as expressions and values.
  This allows us to write a function like isEven as follows, since`n % 2 == 0`
  evaluates to and returns a single boolean value when @n is provided.
  Notice the syntax for defining functions;
  The parameter and return types should be declared.
  Write an isOdd function.
*/
def isEven(n: Int): Boolean = n % 2 == 0
isEven(24)

def isOdd = ???

/*
  5. Write a function that squares a number.
  This function should be one line, similar to isEven.
*/
def square = ???

/*
  6. Write a function lessThan10 which returns
  whether @a + @b is strictly less than 10.
*/
def lessThan10 = ???

/*
  7. e = if (condition) e1 else e2
  If the condition is true, then e = e1
  but if the condition is false, then e = e2
  You are allowed to chain these as follows:
  e = if (condition) e1 else if (condition2) e2 else e3

  Complete the positiveHello function.
*/
val num = 7
if (num > 1) "Number > 1" else "Number <= 1"
if (num > 10) "Number > 10" else if (num > 5) "Number > 5" else "Number <= 5"

def isPositive(n: Int): String = if (n > 0) "Positive" else "Not positive"

/**
  * This function should take an int @n,
  * and return "Hello" if n squared is positive
  * and "Goodbye" otherwise
  */
def positiveSquareHello = ???

/*
  8. Examine the following examples for how to write a for/while loop.
  Notice that we use {} brackets to group code together.
  Finish the incomplete functions.
*/

def countToWhile(n: Int) = {
  var counter = 0
  while (counter <= n){
    print(counter + " ")
    counter += 1
  }
}

def countToFor(n: Int) = {
  for (counter <- 0 to n){
    print(counter + " ")
  }
}

countToWhile(3)
countToFor(3)

/*
  countFromTo should print the numbers from @start to @end, inclusive
*/
def countFromTo = ???

/*
  9. You can loop through arrays similarly to Python.
  Finish the incomplete functions.
*/

val to10 = (1 to 10).toArray
def printIfEven(nums: Array[Int]) = {
  // Notice the omission of {} braces; we can do so since the entire conditional is just one expression!
  for (num <- nums) if (num % 2 == 0) print(num + " ")
}

printIfEven(to10)

/*
  sumLength should return the sum of the lengths of each string in @strings
*/
def sumLength(strings: Array[String]) = ???

/*
  10. More practice! Complete the following functions.
*/

/**
  * Finds the greatest number in an array of doubles
  *
  * @param nums the array of doubles
  * @return the greatest number in @nums
  */
def findMax(nums: Array[Double]) = ???

/**
  * Returns whether @bools contains at least one True
  *
  * @param bools the array of booleans
  * @return whether @bools contains at least one True
  */
def atLeastOneTrue(bools: Array[Boolean]) = ???