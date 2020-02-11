import java.util.Scanner;
public class array5{
public static void main(String[] args) 
    {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter array size..");
	  int size= sc.nextInt();
      int array1[] = new int[size];
      int array2[] = new int[size];
      System.out.println("enter first array elements..");
      for(int i = 0; i < size; i++)
    	  array1[i]=sc.nextInt();
      
      System.out.println("enter second array elements..");
      for(int i = 0; i < size; i++)
    	  array2[i]=sc.nextInt();
      
        for (int i = 0; i < size; i++)
        {
            if(i%2==0)
            	System.out.print(array2[i]+" ");
            else
            	System.out.print(array1[i]+" ");
        }
}}