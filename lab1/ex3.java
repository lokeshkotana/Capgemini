package lab1;

import java.util.*;
class B1
{
boolean checkNumber(long number)
{
long num=number;
long p=num%10;
num=num/10;
int f=0;
while(num>0)
{
	
	long c=num%10;
	if(p<c)
	{
		f=1;
		break;
	}
	p=c;
	num/=10;
}
if(f==0)
	return true;
else
	return false;
}

}


public class ex3
{

public static void main(String args[])
{
B1 a=new B1();
Scanner sc= new Scanner(System.in);
long n=sc.nextLong();
boolean b=a.checkNumber(n);
if(b)
System.out.println(n +" is an increasing number");
else
System.out.println(n+" is not an increasing number");	
}
}