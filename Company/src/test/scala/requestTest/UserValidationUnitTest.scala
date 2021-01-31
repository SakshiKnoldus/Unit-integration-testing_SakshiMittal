package requestTest

import com.knoldus.models.User
import com.knoldus.request.UserImpl
import com.knoldus.validator.{EmailValidator, UserValidator}
import org.mockito.MockitoSugar.{mock, when}

class UserValidationUnitTest extends org.scalatest.AsyncFlatSpec {

   val checkUser = User("Sakshi", "Software Trainee", "Knoldus", "sakshi.mittal@knoldus.com")

  "A user " should " exist in the database" in {
    val mockedUserValidator = mock[UserValidator]
    when(mockedUserValidator.userIsValid(checkUser)) thenReturn false

    val userImplementation = new UserImpl(mockedUserValidator)

    val createTheUser = userImplementation.createUser(checkUser)
    assert(createTheUser.isEmpty)
  }
  it should "have a valid email id" in{
    val emailvalid = new EmailValidator
    assert(emailvalid.emailIdIsValid(checkUser.emailId))
  }
}
