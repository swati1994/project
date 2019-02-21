package com;

public class LoginService {
  
	public boolean checkUser(Login login){
		if((login.getName().equalsIgnoreCase("admin")) && 
				(login.getPass().equalsIgnoreCase("admin"))){
			return true;
		}
		else
			return false;
	}
}
