package project;

import java.util.HashMap;

public class login {

	HashMap userDictionary;
	
	public login(){
		userDictionary=new HashMap();
		userDictionary.put("iten", "12899");
		

	}
	public boolean validate(String username,String password){
		boolean validationresult=false;
		String fetchedPassword=(String)userDictionary.get(username);
		if(fetchedPassword != null){
			validationresult=fetchedPassword.equals(password);
		}
		return validationresult;
	
	}
}
