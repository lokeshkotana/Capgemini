package lab1;

import java.util.*;
class qw
{
int calculateDifference(int n)
{

int a=0,b=0;
for(int i=1;i<=n;i++)
{
 a+=i*i;
b+=i;
}
int sum=a-b*b;

return sum;
}

}


public class ex2
{

public static void main(String args[])
{
qw a=new qw();
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int sum=a.calculateDifference(n);
System.out.println("difference between the sum of the squares of the first "+n+" natural numbers and the square of their sum = "+sum);

}
}