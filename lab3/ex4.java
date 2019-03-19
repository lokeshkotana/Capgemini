package lab3;

/*
Exercise 4: Create a method that accepts a character array and count the number of times each 
character is present in the array.
*/
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	char []ch= {'s','e','a','s','r','r','e','e','l'};
	
	int a[]=new int[26];
	
	for(char i:ch)
	{
		a[i-97]++;
	}
	
	for(char i:ch)
	{
		if(a[i-97]!=-1)
		System.out.println(i+" "+a[i-97]);
		a[i-97]=-1;
	}
	
	
	}

}
