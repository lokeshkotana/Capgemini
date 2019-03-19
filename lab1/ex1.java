package lab1;

import java.util.*;
class B
{
int calculateSum(int n)
{

int sum=0;
for(int i=1;i<=n;i++)
{
if(i%3==0  ||  i%5==0)
{
sum=sum+i;
}

}

return sum;
}

}


public class ex1
{

public static void main(String args[])
{
B a=new B();
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int sum=a.calculateSum(n);
System.out.println("sum of first "+ n +" natural numbers which are divisible by 3 or 5 : "+sum);

}
}