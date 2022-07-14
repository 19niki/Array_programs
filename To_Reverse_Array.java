package Git_Array_Programs;

/*
 * To reverse the array 
 * i/p:45,52,14,78,32,53,
 * o/p:53,32,78,14,52,45,
 */
public class To_Reverse_Array {
public static void reverse_Array(int a[])
{
	System.out.println("Array before reverse");
	for(int i=0; i<a.length;i++)
	{
		System.out.print(a[i]+",");
	}
	for(int i=0; i<a.length/2;i++)
	{
		int temp=a[i];
		a[i]=a[a.length-i-1];
		a[a.length-i-1]=temp;
	}
    System.out.println();
	System.out.println("Array after reverse");
	for(int i=0; i<a.length;i++)
	{
		System.out.print(a[i]+",");
	}
}
	public static void main(String[] args) {
		int a[]= {45,52,14,78,32,53};
		reverse_Array(a);

	}

}
