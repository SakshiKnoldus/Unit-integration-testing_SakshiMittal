import org.scalatest.FunSuite
import org.knoldus.CheckPassword


class PasswordTestcases extends FunSuite {

   test("It should return true if entered password is valid according to password validation conditions"){
     assert(CheckPassword.isPasswordValid("Knoldus@org1") === true)
   }
}
