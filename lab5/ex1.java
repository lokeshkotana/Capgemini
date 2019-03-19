package lab5;
import java.util.*;
/*Exercise 1: Write a java program that simulates a traffic light. The program lets the user 
select one of three lights: red, yellow, or green with radio buttons. On entering the choice, 
an appropriate message with “stop” or “ready” or “go” should appear in the console .Initially
there is no message shown.
*/
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter choice");
		System.out.println("red");
		System.out.println("yellow");
		System.out.println("green");
		System.out.println("***************");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		switch(s)
		{
		case "red":
			System.out.println("STOP!");
		break;
		
		case "yellow":
			System.out.println("READY!");
		break;
		
		case "green":
			System.out.println("GO!");
		break;
		
		default:
			System.out.println("wrong choice");
		
		
		}
	}

}
