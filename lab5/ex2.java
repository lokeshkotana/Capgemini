package lab5;
import java.util.*;
/*Exercise 2: The Fibonacci sequence is defined by the following rule. The first 2 values in the 
sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it. Write a Java
program that uses both recursive and nonrecursive functions to print the nth value of the
Fibonacci sequence?
*/		
public class ex2 {

	static long fib(long n)
	{
		
		long a=1,b=1;
		if(n==1)
			return a; 
		if(n==2)
			return b;
		long c = 0;
		for(long i=0;i<n-2;i++)
		{
		c=a+b;
		a=b;
		b=c;
		}
		return c;
		
	}
	static long fibrec(long n)
	{
		
		
		if(n<=2)
			return 1;
		return fibrec(n-1)+fibrec(n-2);
	}
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);	
	System.out.println("enter number");
	long n=sc.nextInt();

	long a=fib(n);
long b=fibrec( n);

System.out.println(a);
System.out.println(b);



	}
}
