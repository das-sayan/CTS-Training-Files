import java.util.Scanner;
class test1{
 public static void main(String ar[]){
		int a=2,b=5,flag=0,count=0,i,j;
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter series length");
		//int n= sc.nextInt();
		System.out.println("series");
		System.out.print(a+" ");
		for(i=5;i<100;i++){
			for(j=2;j<i;j++)
			{
				if(i%j==0){
					flag = 0;
					break;
				}
				else
					flag=1;
			}
			if(flag==1)
			{
				count++;
				if(count%2!=0)
					System.out.print(i+" ");
			}
		}
 }
}