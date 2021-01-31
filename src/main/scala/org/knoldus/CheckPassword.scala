package org.knoldus

object CheckPassword {

 def isPasswordValid(password : String) : Boolean = {
   if(password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,15}$"))
     return true
     else
     return false
   }
}
