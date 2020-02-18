import java.util.Scanner;
class Problem2{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		int product1,product2,product3;
		System.out.println("Enter Product 1 Price:");
		product1=sc.nextInt();
		System.out.println("Enter Product 2 Price:");
		product2=sc.nextInt();
		System.out.println("Enter Product 3 Price:");
		product3=sc.nextInt();
		if(product1>0 && product2>0 && product3>0){
			
		int total= product1+product2+product3;
		int discount= (int)(total - (total*0.2));
		System.out.println("20% discount of products "+discount);
		int cost;
		if(product1 > product2 && product1 > product3)
			cost= product1+product2;
		else if(product2 > product3 && product2 > product1)
			 cost= product2+product3;
		else
			cost= product1+product3;
		System.out.println("cost by eliminatig the least product "+cost);
		if(total > cost)
			System.out.println("Go for 2nd offer and pay Rs"+cost);
		else
			System.out.println("Go for 1st offer and pay Rs"+total);
	}else
		System.out.println("Prices can't be negative");
}}