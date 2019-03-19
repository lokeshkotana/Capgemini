package lab7;

/*Create a method that accepts a character array and count the number of times each character 
is present in the array. Add how many times each character is present to a hash map with the 
character as key and the repetitions count as value
*/

import java.util.*;

public class ex2 {

	static Map countCharacter(char []c)
	{
		Map<Character,Integer>m=new HashMap<Character,Integer>();
		
		for(char i : c)
			
		{
			if(m.containsKey(i))
			{
				m.put(i, m.get(i)+1);
			}
			else
			{
				m.put(i,1);
			}
		}
	
		
		return m;
		//System.out.println(m.get(c[0]));
	//return 5;
	}
	public static void main(String []args)
	{
		char[]c= {'A','P','P','L','E'} ;
		ex2 e =new ex2();
		Map<Character,Integer>m1=new HashMap<Character,Integer>();
		m1=countCharacter(c);
		
		System.out.println(m1);
		
		Set<Character >s=m1.keySet();
		for(Character i:s)
		{
			System.out.println(i+" "+m1.get(i));
		}
		
		
		
	}
	
	
}
