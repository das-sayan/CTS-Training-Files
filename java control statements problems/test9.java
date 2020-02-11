import java.util.Scanner;
class test9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter start size");
		int a = sc.nextInt();
		System.out.println("enter end size");
		int b = sc.nextInt();
		System.out.println("Series..");
		for(int i=a;i<=b;i++)
			System.out.print(i+" ");
}}