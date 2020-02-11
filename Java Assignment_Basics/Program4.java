import java.util.Scanner;
public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("Largest:" +a);
			if(b>c)
				System.out.println("second largest:" +b);
			else
				System.out.println("second largest:" +c);
		}
		else if(b>a && b>c)
		{
			System.out.println("Largest:" +b);
			if(a>c)
				System.out.println("second largest:" +a);
			else
				System.out.println("second largest:" +c);
		}
		else{
			System.out.println("Largest:" +c);
			if(a>b)
				System.out.println("second largest:" +a);
			else
				System.out.println("second largest:" +b);
		}
			
		}

}}
