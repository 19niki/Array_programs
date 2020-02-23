/*
 * To find minimum and second minimum element in the array
 */
public class Min_element_in_Array {
public static void min_element(int a[])
{
	int min=a[0];
	int sec_min=a[1];
	for(int i=0; i<a.length;i++)
	{
		if(min>a[i])
		{
			sec_min=min;
			min=a[i];
		}
		else if(a[i]<sec_min)
		{
			sec_min=a[i];
		}
	}
	System.out.println(min);
	System.out.println(sec_min);
}
	public static void main(String[] args) {
		int a[]= {56,21,52,79,91,11};
		min_element(a);


	}

}
