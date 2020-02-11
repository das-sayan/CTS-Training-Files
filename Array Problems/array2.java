import java.util.Scanner;
public class array2{
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
	  
	  int array3[] = new int[size+size];
	  int k=0,x=0,y=0;
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {
                 
                 //System.out.println(array1[i] + " " + array2[j]);
				 x=array1[i];
				 y=array2[j];
				 
				 for(;k<array3.length;)
				 {
					 array3[k]=x;
					 k++;
					 array3[k]=y;
					 k++;
					 break;
					 
				 }
				 //System.out.println(k);
				 
                 }
            }
        }
		int k1=0,k2=0;
		for(k1=0;k1<k;k1++)
		{
				if(k1%2==0){
				System.out.print(array3[k1]+" ");
				}
		}
		
		for(k2=0;k2<k;k2++)
		{
				if(k2%2!=0){
				System.out.print(array3[k2]+" ");
				
				}
		}
		int k3;
		for(k3=0;k3<k;k3++);
		System.out.println("\ntotal elements: " +k3);
 
    }
}