package Git_Array_Programs;

/*
 * sort the elements using selection sorts
 */
public class Selection_Sort {
public static void sort(int a[])
{
	for(int i=0; i<a.length;i++)
	{
		int pos=i;
		for(int j=i+1; j<a.length; j++)
		{
			if(a[pos]>a[j])
			{
				pos=j;
			}
		}
			if(a[pos]!= a[i])
			{
				int temp=a[i];
				a[i]=a[pos];
				a[pos]=temp;
			}
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
	public static void main(String[] args) {
		int a[]= {96,21,52,79,91,11};
		sort(a);

	}

}
