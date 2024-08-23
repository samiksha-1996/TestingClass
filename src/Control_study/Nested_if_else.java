package Control_study;

public class Nested_if_else {

	public static void main(String[] args) {
		//enter your email id
		//if email correct then enter password
		//if password is correct then lof=gin successful
		//else password is incorrect
		//else email id is incorrect
		
		String emailid ="java@gamil.com";
		String password ="java12345";
		
		if(emailid =="java@gamil.com")
		{
			System.out.println("Email id is correct, Please enter password");
		
		
		 if(password =="java12345")
		{
			System.out.println("Password is correct,Login done");
		}
		else 
		{
			System.out.println("Incorrect password");
		}
		}
		
		else
		{
			System.out.println("emailid is incorrect");
		}
	}
}
		
		/*if (emailid == "java1@gmail.com")
		{
			System.out.println("Email id is correct, please enter password");
			
			if (password == "java@12345")
			{
			System.out.println("Password is correct, login success");
			} 
			else 
			{
			System.out.println("incorrect Password");
			}
			} 
		else
		{
			System.out.println("email id is incorrect");
			}
	}

}*/
