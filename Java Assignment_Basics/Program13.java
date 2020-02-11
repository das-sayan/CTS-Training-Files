import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Array Size: ");  
		  int n=sc.nextInt();
		int a[]= new int[n];
		System.out.print("Enter Array Elements: ");  
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter Element to Search: ");  
		  int search=sc.nextInt();
		  
		 for(int i=0;i<a.length;i++) {
			 
			 if(a[i]==search) {
				 System.out.print("Element Found..");
				  System.exit(0);
				 }
			 
		 } System.out.print("Element Not Present..");

	}

}
