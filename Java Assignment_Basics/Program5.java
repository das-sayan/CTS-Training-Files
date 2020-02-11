import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String s = sc.nextLine();
		//sc.nextLine();
		System.out.println("Enter Marks of Subject1:");
		int m1=sc.nextInt();
		System.out.println("Enter Marks of Subject2:");
		int m2=sc.nextInt();
		System.out.println("Enter Marks of Subject3:");
		int m3=sc.nextInt();
		System.out.println("Student Name:"+s+"\n1st Subject Marks:"+m1+"\n2nd Subject Marks:"+m2+"\n3rd SubjectMarks:"+m3);
		int total=(m1+m2+m3);
		int avg=(m1+m2+m3)/3;
		System.out.println("Total Marks:"+total+" and Average marks:"+avg);
		if(total>=60)
			System.out.println("Marks Above 60%.. 1st grade..");
		else if(total>=50 && total<=59)
			System.out.println("Marks Below 60%.. 2nd grade..");
		else if(total>=40 && total<=49)
			System.out.println("Marks Below 50%.. Just Passed !!");
		else
			System.out.println("Failed !!");
	}

}
