package lab3;

/*Exercise 1: Create a method which accepts an array of integer elements and return the second
		smallest element in the array
*/
public class ex1 {
 
	static int  getSecondSmallest(int a[]) {
		
		int f=Integer.MAX_VALUE,s=Integer.MAX_VALUE,fg=0;
		for(int i=0;i<a.length;i++)
		{
			if(f>a[i])
			{
				s=f;
				 f=a[i];
				 fg=1;
			}
			else if(a[i]!=f && a[i]<s)
 			{
				s=a[i];
			}
				
			
		}
		if(fg==0)
			return a[1];
		return s;
	}
	 public static void main(String[] args){
		
		 
//int a[]= {3,6,2,65,46,22};		 
		 int a[]= {40,43,34,34,34};
		 
		 int sec=getSecondSmallest(a);
		 
		System.out.println(sec);
		 
	 }
	 }
	
	

