import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int large= (a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("Largest of 3 numbers:"+large);
				

	}

}
