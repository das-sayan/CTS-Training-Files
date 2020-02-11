
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		int sum=0;
		System.out.println("odd numbers in the range:");
		for(int i=1;i<=n;i++) {
			if(i%2!=0)
			{
				System.out.print(i+" ");
				sum= sum+i;
			}
		}
		System.out.println("\nsum of odd numbers:"+sum);
	}

}
