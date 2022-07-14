package Git_Array_Programs;

/*
 * To find square of all the elements in the array
 */
public class To_find_square_of_all_num_in_Array {

	public static void main(String[] args) 
	{
		int a[]= {5,2,9,3};
		System.out.println("the given array is");
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int b[]=new int[a.length];
		System.out.println("Square of the given array is");
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i]*a[i];
			System.out.println(b[i]);
			
		}

	}

}
