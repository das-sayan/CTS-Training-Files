
import java.math.BigInteger;
import java.util.Scanner;

public class Program10 {



	public static void main(String[] args) {
				
			  Scanner sc = new Scanner(System.in);
			  System.out.print("Enter a Number: ");  
			  int num=sc.nextInt();
		       
		      BigInteger ans  =new BigInteger("1"); // assigning value 1 to ans variable ..
			for(int i=1;i<=num;i++)
		         ans = ans.multiply(BigInteger.valueOf(i));
		      
		     System.out.println("Factorial Result: "+ans.toString()); 
			  
	}

}
