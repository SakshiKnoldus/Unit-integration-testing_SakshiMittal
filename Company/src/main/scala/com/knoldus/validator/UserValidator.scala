package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.User

class UserValidator {

  val emailObject = new EmailValidator()
  val userCompanyObject = new CompanyReadDto()

  def userIsValid(user: User): Boolean = {

    if(userCompanyObject.getCompanyByName(user.companyName) != null && emailObject.emailIdIsValid(user.emailId))
      return true
    else
      return false
  }

}
