package requestTest

import com.knoldus.models.Company
import com.knoldus.request.CompanyImpl
import com.knoldus.validator.{CompanyValidator, EmailValidator}
import org.mockito.MockitoSugar.{mock, when}

class CompanyValidationUnitTest extends org.scalatest.AsyncFlatSpec {

  val companyObject = Company("knoldus", "knoldus@gmail.com", "Noida")

  "A company" should " not already exist in database" in {

    val mockedCompanyValidator = mock[CompanyValidator]
    when(mockedCompanyValidator.companyIsValid(companyObject)) thenReturn true

    val companyImplObject = new CompanyImpl(mockedCompanyValidator)
    val createComp = companyImplObject.createCompany(companyObject)
    assert(!(createComp.isEmpty))
  }

  it should "have a valid email ID" in {
    val validateEmail = new EmailValidator
    assert(validateEmail.emailIdIsValid(companyObject.emailId))
  }

}
