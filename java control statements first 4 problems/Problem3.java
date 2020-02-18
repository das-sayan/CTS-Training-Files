import java.util.Scanner;
class Problem3{
	public static void main(String arr[]){
		int choco,child;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Chocolates");
		choco=sc.nextInt();
		System.out.println("Enter No. of Children");
		child=sc.nextInt();
		int i,j=0;
		for(i=1;i<=child;i++)
		{
			for(j=choco;j>i;j=j-i)
			{
				choco=choco-i;
				break;
			}
		}
		System.out.println("Remaining Chocolates " +j);
	}
}