package dbTest

import com.knoldus.db.EmployeeReadDto
import org.scalatest.FunSuite

class EmployeeReadDtoTest extends FunSuite {

  val employeeDatabaseObject = new EmployeeReadDto()

  test("It should return true if employee exists in Database.") {
    assert(employeeDatabaseObject.getEmployeeByName("Suhana") != None)
  }

  test("It should return true if employee does not exist.") {
    assert(employeeDatabaseObject.getEmployeeByName("Mishka") === None)
  }
}
