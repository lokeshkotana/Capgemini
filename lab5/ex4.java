package lab5;


import java.util.*;
/*Exercise 4: Write a Java Program to validate the full name of an employee. Create and throw a 
user defined exception if firstName and lastName is blank.
*/
class UserException extends Exception
{
	public String mess()
	{
		return "enter any name";
	}
}

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);	
		System.out.println("enter First Name");
		String  fn=sc.nextLine();
		
		System.out.println("enter Last Name");
		String  ln=sc.nextLine();
		try
		{
		if(fn.length()==0 && ln.length()==0)
		{
		throw new UserException();
		}
		else
		{
		System.out.println("Name is "+fn+" "+ln);
		
		}
		}
		catch(UserException e)
		{
			System.out.println(e.mess());
		}
		
	 
	}

}
