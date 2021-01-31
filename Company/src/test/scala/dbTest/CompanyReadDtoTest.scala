package dbTest

import com.knoldus.db.CompanyReadDto
import org.scalatest.FunSuite

class CompanyReadDtoTest extends FunSuite {

   val companyDatabaseObject = new CompanyReadDto()

   test("It should return true if company exist in database") {
     assert(companyDatabaseObject.getCompanyByName("Knoldus")!= None)
   }

  test("It should return true if company does not exist in database") {
    assert(companyDatabaseObject.getCompanyByName("Walmart")=== None)
  }
}
