package demo;
import java.util.*;
public class string18 {
	
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int count = 0;
	System.out.print("Enter string1 : ");
	String string = sc.nextLine();
	String[] c = string.split(" "); 
	
	
	System.out.print("Enter string2 : ");
	String string2 = sc.nextLine();
	String[] c1 = string2.split(" ");
	String temp="" ;
	for (int i= 0; i<c.length ;i++)
	{
		for (int j =0; j<c1.length;j++)  
		
		if (c[i].equals(c1[j])) {
			
			count++;
		}	
	}
	System.out.print("Number of similar words: " + count);

}}