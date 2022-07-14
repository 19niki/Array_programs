package Git_Array_Programs;

/*
 * To find the second largest element in the array 
 */
public class Second_Large_Element_in_Array 
{
public static void second_large(int a[])
{
	int large=0; 
	int second=1;
    for(int i=1;i<a.length;i++)
	{
		if(large<a[i])
		{
			second=large;
			large=a[i];
		}
		else if(a[i]>second)
		{
			second=a[i];
		}		
	}
	System.out.println(second);
}
	public static void main(String[] args) {
		int a[]= {56,21,52,79,91};
		second_large(a);


	}

}
