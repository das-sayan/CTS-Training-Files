import java.util.Scanner;
class test4{
 public static void main(String ar[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter total number of sticks");
	int total_sticks = sc.nextInt();
	int each_side= (int)(total_sticks/4);
	int square = ((each_side*2)*(each_side*2));
	System.out.println("largest square that can be formed using 'n' sticks= "+square);
	
 }}