package lab3;

import java.util.Arrays;

/*Exercise 3: Create a method which accepts an integer array, reverse the numbers in the array and 
returns the resulting array in sorted order
*/

public class ex3 {
	
	static int[] getSorted(int a[])
	{
		
		for(int i=0;i<a.length;i++)
		{
			String s=Integer.toString(a[i]);
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		
			s=sb.toString();
			
			a[i]=Integer.parseInt(s);
			Arrays.sort(a);
		}
		
		return a;
	}
	public static void main(String[] args){
		
		int a[]= {42,6,21,75,64,345,535};
		int a1[]=new int[a.length];
		a1=getSorted(a);
		
		for(int i:a1)
		System.out.println(i);
		
	}
	
}
