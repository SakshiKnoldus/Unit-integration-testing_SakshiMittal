package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Employee

class EmployeeValidator {

  val emailObject = new EmailValidator()
  val companyObject = new CompanyReadDto()

  def employeeIsValid(employee: Employee): Boolean = {

    if(companyObject.getCompanyByName(employee.companyName) != null && emailObject.emailIdIsValid(employee.emailId))
        return true
        else
        return false
  }
}
