package Git_Array_Programs;

/*

 * To find the summation of all the elements in the array
 * i/p:{10,20,30}
 * o/p:60
 */
import java.util.*;
public class Sumation_of_Array_elements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
       System.out.println("Enter the size of the array");
       int n=s.nextInt();
       System.out.println("Enter the elements of the array");
       int a[]=new int[n];
       for(int i=0; i<a.length;i++)
       {
    	   a[i]=s.nextInt();
       }
        int sum=0;
        for(int i=0; i<a.length;i++)
        {
        	sum=sum+a[i];
        }
        System.out.println("Sum of the elements of the array is:"+sum);
	}

}
