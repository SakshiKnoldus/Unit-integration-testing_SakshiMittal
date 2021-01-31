package validatorTest

import com.knoldus.db.CompanyReadDto
import com.knoldus.validator.{CompanyValidator, EmailValidator}
import org.scalatest.FunSuite

class CompanyIntegrationTest extends FunSuite {

  val companyValidationObject = new CompanyValidator()
  val emailValidationObject = new EmailValidator()
  val companyDbObject = new CompanyReadDto()

  test("Test case should return true if company does not exists in the database and returns true if email ID is valid") {
    assert(!companyValidationObject.companyIsValid(companyDbObject.knoldusCompany)===true && emailValidationObject.emailIdIsValid(emailId = "knoldus@gmail.com")===true)
  }

}
