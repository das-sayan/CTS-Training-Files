import java.util.Scanner;
class test10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size.. ");
		int n = sc.nextInt();
		int t1 = 0, t2 = 1, nextTerm,a=0;
		System.out.print("The amoeba size is ");
		for (int i = 1; i <= n; i++) {
        a=t1;
        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
		}
	System.out.println(a);
}}