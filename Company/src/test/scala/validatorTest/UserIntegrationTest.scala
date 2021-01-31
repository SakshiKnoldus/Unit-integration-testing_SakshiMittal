package validatorTest

import com.knoldus.db.UserReadDto
import com.knoldus.validator.{EmailValidator, UserValidator}
import org.scalatest.FunSuite

class UserIntegrationTest extends FunSuite {

  val userValidationObject = new UserValidator()
  val emailIdObject = new EmailValidator()
  val userDbObject = new UserReadDto()

  test("Test case should return true if company exists in database and email ID is valid.") {
    assert(userValidationObject.userIsValid(userDbObject.userNumber1)=== true && emailIdObject.emailIdIsValid(emailId = "knoldus@gmail.com") === true)
  }


}
