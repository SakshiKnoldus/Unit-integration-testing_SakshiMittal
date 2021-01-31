package org.knoldus

object PalindromeFactorialImplementation extends CheckPalindromeFactorial {

  override def isPalindrome(number: Int): Boolean = {

    val convertedNumber = number.toString

    if (convertedNumber.equals(convertedNumber.reverse))
      return true
    else
      return false

  }

  override def calculateTheFactorial(number: Int): Int = {

    var factorial = 1

    for (i <- 1 to number)
    {
      factorial = factorial * i
    }
    return factorial
    }
}
