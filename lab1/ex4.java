package lab1;

import java.util.*;

class B2
{
boolean checkNumber(long number)
{
int f=0;
long i=0;
long p=1;
do
{
	if(p==number)
	{
		f=1;
	}
	p=p*2;
}while(p<=number);
if(f==1)
	return true;
else
	return false;
}

}
public class ex4
{

public static void main(String args[])
{
B2 a=new B2();
Scanner sc= new Scanner(System.in);
long n=sc.nextLong();
boolean b=a.checkNumber(n);
if(b)
System.out.println(n +" is a power of 2");
else
System.out.println(n+"  is not a power of 2");	
}
}