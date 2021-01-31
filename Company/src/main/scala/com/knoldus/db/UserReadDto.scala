package com.knoldus.db

import com.knoldus.models.{Company, User}

import scala.collection.immutable.HashMap

class UserReadDto {

  val userNumber1: User = User("Sakshi", "Software Trainee", "Knoldus", "sakshi.mittal@knoldus.com")
  val userNumber2: User = User("Shivani", "Software Trainee", "Knoldus", "shivani.sarthi@knoldus.com")

  val users: HashMap[String, User] = HashMap("Sakshi" -> userNumber1, "Shivani" -> userNumber2)

  def getUserByName(name: String): Option[User] = users.get(name)

}
