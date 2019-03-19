package lab7;
/*
Exercise 3: Create a method which accepts an array of numbers and returns the numbers 
and their squares in HashMap
*/
import java.util.*;
public class ex3 {

static Map getSquares(List<Integer> li)
{
	Map<Integer,Integer> m=new HashMap<Integer,Integer>();
	
	for(int i : li)
	{
		m.put(i, i*i);
	}
	//System.out.println(li.size());
	
	return m;
}


public static void main(String []args)
{
	
	List l=new ArrayList();
	l.add(2);
	l.add(4);
	l.add(1);
	l.add(5);
	l.add(3);
	Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
    m1=getSquares(l);
	
    Set<Integer> s=m1.keySet();
	for(int i:s)
	{
		System.out.println(i+" "+m1.get(i));
	}
}





}

