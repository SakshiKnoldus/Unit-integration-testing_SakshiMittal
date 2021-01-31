package validatorTest

import com.knoldus.validator.EmailValidator
import org.scalatest.FunSuite

class EmailValidationTest extends FunSuite {

  val emailObject = new EmailValidator()
  test("Email ID is Valid") {
    assert(emailObject.emailIdIsValid("sakshi.mittal@knoldus.com") === true)
  }
}
