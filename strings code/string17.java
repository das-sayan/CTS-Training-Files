package demo;
import java.util.*;

public class string17 {

	public static void main(String args[]) {
		

		Scanner str = new Scanner(System.in);
		Scanner intr = new Scanner(System.in);
		System.out.println("Input1: ");
		String string1 = str.nextLine();
		
		System.out.println("Input2: ");
		String string2 = str.nextLine();
		
		
		System.out.println("Input3: ");
		int input3 = intr.nextInt();
		
		
		int a=Integer.parseInt((string1.substring(6,string1.length())));
		int b=Integer.parseInt((string2.substring(6,string2.length())));
		
		if (a>b)
		
		System.out.print("Output- "+(a-b)*input3);
		
		if (b>a)
		System.out.print("Output- "+(b-a)*input3);
		
		
	}	
}