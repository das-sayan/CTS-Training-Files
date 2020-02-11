package demo;
import java.util.Scanner;
public class string27 {
    public static void main(String[] args) {
    	String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        s=sc.nextLine();
        if(s.contains("a") && s.contains("e") && s.contains("i") &&
        		s.contains("o") && s.contains("u"))
        {
        	System.out.println("1..all vowels present..");
        }
        else
        	System.out.println("2..all vowels not present..");
                
    }
}