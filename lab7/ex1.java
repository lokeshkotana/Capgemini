
package lab7;
/*Exercise 1: Create a method which accepts a hash map and return the values of the map in sorted 
order as a List.

*/

import java.util.*;
	public class ex1{

		public static List getValues(Map<Integer,Integer> m){
			//Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
			List <Integer>l=new ArrayList();	
			
			 Set<Integer> s=m.keySet();
				for(int i:s)
				{
					l.add(m.get(i));
				}
			
			Collections.sort(l);	
		
		return l;
		}
		public static void main(String []args)
		{
			Map<Integer,Integer> m=new HashMap<Integer,Integer>();
			m.put(1, 80);
			m.put(2, 30);
			m.put(3, 15);
			m.put(4, 50);
			
			
			List<Integer> l=new ArrayList();
		l=getValues(m);
		for(int i:l)
		{
			System.out.println(i);
		}
		}
	}
		
	
