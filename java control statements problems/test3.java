import java.util.Scanner;
class test3{
 public static void main(String ar[]){
 Scanner sc = new Scanner(System.in);
	int sum=0,num,rem=0;
	System.out.println("enter a number..");
	num= sc.nextInt();
	while(num>0)
	{
		rem=num%10;
		sum=sum+rem;
		num=num/10;
	}
	System.out.println("Patrick and Johnny must go in path " +sum +" to find Alice");
 }}