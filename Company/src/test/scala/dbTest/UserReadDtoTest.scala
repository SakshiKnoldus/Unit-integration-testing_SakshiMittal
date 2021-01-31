package dbTest

import com.knoldus.db.UserReadDto
import org.scalatest.FunSuite

class UserReadDtoTest extends FunSuite {

  val userDatabaseObject = new UserReadDto()

  test("It should return true if the user exists in Database.") {
    assert(userDatabaseObject.getUserByName("Sakshi") != None)
  }

  test("It should return true if user does not exist in the Database") {
    assert(userDatabaseObject.getUserByName("Anmol") === None)
  }
}
