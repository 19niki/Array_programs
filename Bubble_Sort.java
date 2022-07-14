package Git_Array_Programs;

/*
 * To sort the elements of the array using ascending order
 */
public class Bubble_Sort {

	public static void sort(int a[])
	{
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-i-1; j++)
			{
			    if(a[j]>a[j+1])    // to descending order  if(a[j]<a[j+1])
			    {
			    	int temp=a[j];
			    	a[j]=a[j+1];
			    	a[j+1]=temp;
			    }
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int a[]= {56,21,52,79,91,11};
		sort(a);

	}

}
