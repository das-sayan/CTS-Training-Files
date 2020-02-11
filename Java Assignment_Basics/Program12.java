import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Start Range: ");  
		  int low=sc.nextInt();
		  System.out.print("Enter Last Range: ");  
		  int high=sc.nextInt();
		  int i,flag;
		  int sum=0;  
		while (low < high) {
	        flag = 0;
	       
	        for (i = 2; i <= low / 2; i++) {
	            if (low % i == 0) {
	                flag = 1;
	                break;
	            }
	        }
	        if (flag == 0) {
	            System.out.println(low+" ");
	        	sum=sum+low;
	        }
	        ++low;
	    }
		System.out.println("Sum= "+sum);
		
	}

}
