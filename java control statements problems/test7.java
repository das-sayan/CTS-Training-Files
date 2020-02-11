import java.util.Scanner;
class test7{
 public static void main(String ar[])
 {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many numbers you want to say..");
	int n= sc.nextInt();
	int a[]=new int[n];
	double score=0.0f;
	System.out.println("Enter numbers...");
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		if(a[i]%2!=0)
			score=score+1;
		else if(a[i]<0){
			score=score-1.0;
			}
		else{
			score=score-0.5;
		    }

	}
	System.out.println("score= "+score);
 }
}