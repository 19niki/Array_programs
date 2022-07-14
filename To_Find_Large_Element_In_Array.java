package Git_Array_Programs;

/*
 * To find the largest element in the Array
 */
public class To_Find_Large_Element_In_Array {
public static void large(int a[])
{
	int large=0;
	for(int i=0; i<a.length;i++)
	{
		if(large<a[i])
		{
			large=a[i];
		}
	}
	System.out.println(large);
	}
	public static void main(String[] args) {
		int a[]= {56,21,52,79,91};
		large(a);

	}

}
