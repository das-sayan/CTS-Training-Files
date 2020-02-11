import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		double num = sc.nextDouble();
		int num1 = (int) num;
		System.out.println("Integer part is: "+num1);
		System.out.println("Fractional Part: " +(float)(num-num1)); 
		

	}

}
