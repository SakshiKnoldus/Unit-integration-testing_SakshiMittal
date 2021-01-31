package validatorTest

import com.knoldus.db.EmployeeReadDto
import com.knoldus.validator.{EmployeeValidator, EmailValidator, UserValidator}
import org.scalatest.FunSuite

class EmployeeIntegrationTest extends FunSuite {

  val employeeValidationObject = new EmployeeValidator()
  val emailValidationObject = new EmailValidator()
  val employeeDatabaseObject = new EmployeeReadDto()

  test("It should return true if employee exists in the database and email ID is valid.") {
    assert(employeeValidationObject.employeeIsValid(employeeDatabaseObject.EmployeeOne)===true && emailValidationObject.emailIdIsValid("suhana.sharma@knoldus.com")===true)
  }
}
