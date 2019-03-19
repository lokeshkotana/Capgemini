package lab5;
//package com.cg.eis.exception;
/*Exercise 6:  Create an Exception class named as “EmployeeException”(User defined Exception) in a 
package named as “com.cg.eis.exception” and throw an exception if salary of an employee is below
than 3000. Use Exception Handling mechanism to handle exception properly.

*/

import java.util.Scanner;

class EmployeeException extends Exception
{
	public String toString()
	{
		return "salary cant be less than 3000";
	}
}

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);	
		System.out.println("enter salary");
		int sal  =sc.nextInt();
		
		
		try
		{
		if(sal<3000)
		{
		throw new EmployeeException();
		}
		else
		{
		System.out.println("salary is "+sal);
		
		}
		}
		catch(EmployeeException e)
		{
			System.out.println(e);
		}
		
	 
	}

}