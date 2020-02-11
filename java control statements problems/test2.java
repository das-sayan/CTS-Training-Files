import java.util.Scanner;
class test2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n= sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter array elements..");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		System.out.println("positive numbers in an array..");
		for(int i=0;i<n;i++)
		{
			if(a[i]>0){
				System.out.print(a[i]+" ");
				sum=sum+a[i];
				System.out.println();
			}
		}
		
		System.out.println("sum=" +sum);
}}