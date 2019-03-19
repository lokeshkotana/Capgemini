package lab4;

/*Exercise 1: Create a method to find the sum of the cubes of the digits of an n digit number
*/
public class ex1 {

	
	
	static long sum(long n)
	{
		long n1=n;
		long sum=0;
		while(n1>0)
		{
			sum=sum+(n1%10)*(n1%10)*(n1%10);
			n1/=10;
		}
		
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	long n=112;
	
	long a=sum(n);
	
	System.out.println(a);
		
		
		
		
	}

}
