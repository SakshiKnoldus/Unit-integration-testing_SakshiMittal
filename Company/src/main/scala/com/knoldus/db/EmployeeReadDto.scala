package com.knoldus.db

import com.knoldus.models.Employee

import scala.collection.immutable.HashMap


class EmployeeReadDto {

  val EmployeeOne: Employee = Employee("Suhana", "Sharma", 24, 12000.0, "Software Trainee", "Knoldus", "suhana.sharma@knoldus.com")
  val EmployeeTwo: Employee = Employee("Tamanna", "Jain", 23, 12000.0, "Software Trainee", "Knoldus", "tamanna.jain@knoldus.com")

  val employee: HashMap[String, Employee] = HashMap("Suhana" -> EmployeeOne, "Tamanna" -> EmployeeTwo)

  def getEmployeeByName(firstName: String): Option[Employee] = employee.get(firstName)
}
