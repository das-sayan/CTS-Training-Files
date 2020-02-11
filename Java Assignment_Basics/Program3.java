import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int count=0;
	    a = a%2 == 0 ? count++ : count--;
	    if (count>=1)
	    	System.out.println("even");
	    else
	    	System.out.println("odd");
	    
		
				

	}

}
