package requestTest
import com.knoldus.models.Employee
import com.knoldus.request.EmployeeImpl
import com.knoldus.validator.{EmailValidator, EmployeeValidator}

import org.mockito.MockitoSugar.{mock, when}

class EmployeeValidationUnitTest extends org.scalatest.AsyncFlatSpec {

  val employeeData = Employee("Suhana", "Sharma", 24, 12000.0, "Software Trainee", "Knoldus", "suhana.sharma@knoldus.com")

  "Employee company name " should " present in Database" in {

    val mockedEmployeeValidator = mock[EmployeeValidator]
    when(mockedEmployeeValidator.employeeIsValid(employeeData)) thenReturn true

    val employeeImplOject = new EmployeeImpl(mockedEmployeeValidator)

    val check_result = employeeImplOject.createEmployee(employeeData)
    assert(!(check_result.isEmpty))
  }

  "Employee's email ID " should " be valid." in {
    val employeeEmail = new EmailValidator()
    assert(employeeEmail.emailIdIsValid(employeeData.emailId))
  }

}
