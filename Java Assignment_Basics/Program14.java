import java.math.BigInteger;
import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Number: ");  
        int num = sc.nextInt();
        long factorial = factorial(num);
        
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    
    public static long factorial(int num)
    {
        if (num >= 1)
            return num * factorial(num - 1);
        else
            return 1;
    }
}