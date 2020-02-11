package demo;
import java.util.*;
public class string15 {

	public static void main(String[] args) {
				
		
		Scanner str = new Scanner(System.in);
		System.out.print("Enter String 1(small caps): ");
		String string = str.nextLine();
		System.out.print("Enter String 2(small caps): ");
		String string2 = str.nextLine();
		int j=0;
		char c;
		if (string.length()<string2.length()) {
			String swapper = string2;
			string2=string;
			string=swapper;
		}
			for (int i=0;i<string.length();i++) {
			
			
				if (j>=string2.length())
					
				{
					c='!';
				}
				else
					c=string2.charAt(j);	
				
				if (string.charAt(i)!=c) {
					
					string = string.replace(string.charAt(i), '+');
				}else 
					{
					
					j++;
					
					}
		}
			System.out.print("Output: "+string);
	}
}