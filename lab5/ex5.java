/*Exercise 5:  Validate the age of a person and display proper message by using user defined 
exception. Age of a person should be above 15.
*/
package lab5;

import java.util.Scanner;

class AgeException extends Exception
{
	public String toString()
	{
		return "enter age above 15";
	}
}

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);	
		System.out.println("enter age");
		int age  =sc.nextInt();
		
		
		try
		{
		if(age<=15)
		{
		throw new AgeException();
		}
		else
		{
		System.out.println("Age is "+age);
		
		}
		}
		catch(AgeException e)
		{
			System.out.println(e);
		}
		
	 
	}

}
