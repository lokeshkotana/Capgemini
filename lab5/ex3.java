package lab5;

import java.util.Scanner;

/*Exercise 3: Write a Java program that prompts the user for an integer and then prints out all 
the prime numbers up to that Integer?*/
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);	
		System.out.println("enter number");
		int n=sc.nextInt();
		
		
		for(int j=2;j<=n;j++)
		{
			int f=0;
		for(int i=2;i<=Math.sqrt(j);i++)
		{
			if(j%i==0)
			{f=1;
			     break;
			}
			
		}
		if(f==0)
		System.out.println(j);
		
		}
	}

}
