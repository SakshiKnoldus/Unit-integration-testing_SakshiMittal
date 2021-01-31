package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company

class CompanyValidator {

  val companyObject = new CompanyReadDto()
  val emailObject = new EmailValidator()

  def companyIsValid(company: Company): Boolean = {

    if(emailObject.emailIdIsValid(company.emailId) && companyObject.getCompanyByName(company.name) == null)
      return true
      else
      return false
  }
}
