/*
 * To print the below fibonacci series
 * [0,1,1,2,3,5,8,13]
 */
public class Fibonacci_In_Array {

	public static void main(String[] args) {
		int a[]=new int[10];
		a[0]=0;
		a[1]=1;
		for(int i=2; i<a.length;i++)
		{
			a[i]=a[i-1]+a[i-2];
		}
        
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
