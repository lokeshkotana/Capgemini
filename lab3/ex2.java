package lab3;
import java.util.*;

/*Exercise 2: Create a method that can accept an array of String objects and sort in alphabetical 
order. The elements in the left half should be completely in uppercase and the elements in the 
right half should be completely in lower case. Return the resulting array.
Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE

*/

public class ex2 {

	static String[] sort(String[]s)
	{
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].charAt(0)>s[j].charAt(0))
				{
					String t;
					t=s[i];
					s[i]=s[j];
					s[j]=t;
					
				}
			}
		}
		
		for(int i=0;i<(s.length+1)/2;i++)
		{
			s[i]=s[i].toUpperCase();
		}
		for(int i=(s.length+1)/2;i<s.length;i++)
		{
			s[i]=s[i].toLowerCase();
		}
		
	return s;	
	}
	
	public static void main(String[] args){

		
		Scanner sc=new Scanner(System.in);

System.out.println("no of strings");
	int n=sc.nextInt();	

String []s=new String[n];


for(int i=0;i<n;i++)
{
	System.out.println("enter the strings");
    s[i]=sc.next();
  //  s[i]=sc.nextLine();
   
}
//sc.nextLine();
	String s1[]=sort(s);
	
	for(String i:s1)
	{
		System.out.println(i);
	}
	}
}
