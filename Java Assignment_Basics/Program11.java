import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Range: ");  
		  int n=sc.nextInt();
		  for(int i=1;i<=n;i++)
		  {
			  if(i%2!=0)
				  System.out.print(" "+i+" ");
			  else
				  System.out.print("-"+i+" ");
		  }

}}
