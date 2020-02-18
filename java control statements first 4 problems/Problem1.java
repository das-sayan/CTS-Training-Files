import java.util.Scanner;
class Problem1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int billno, date;
		System.out.println("Enter Date");
		date=sc.nextInt();
		if(date >0 && date<=31){
			System.out.println("Enter BillNo..");
			billno=sc.nextInt();
			int a= billno%date;
			int b=(billno-date)%10;
			if( a == 0 || b== 0)
				System.out.println("Lucky Customer");
			else
				System.out.println("Not Lucky Customer");
		}	
		else
			System.out.println("Mention Proper Date");
	}
}