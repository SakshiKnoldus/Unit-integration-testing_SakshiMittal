import org.scalatest.FunSuite
import org.knoldus.PalindromeFactorialImplementation

class TestPalindromeFactorial extends FunSuite {

  test("It should return true if the entered number is a palindrome") {
    assert(PalindromeFactorialImplementation.isPalindrome(101) === true)
  }

  test("If entered number is 0, then factorial should be 1") {
    assert(PalindromeFactorialImplementation.calculateTheFactorial(0) === 1)
  }
}
