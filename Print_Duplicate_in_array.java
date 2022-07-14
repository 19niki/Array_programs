package Git_Array_Programs;

/*

 * To print all the duplicate present in the array
 */
import java.util.HashSet;
import java.util.Set;

public class Print_Duplicate_in_array {
	public static void duplicate(int a[])
	{
		
		Set s=new HashSet();
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					if(!s.contains(a[i]))
					{
					
						s.add(a[i]);
					}
				}
			}
			}
	Object o[]=s.toArray();
	for(int i=0; i<o.length;i++)
	{
		System.out.println(o[i]);
	}
	}
	public static void main(String[] args) {
		int a[]= {5,5,5,4,8,5,4,1,4,6};
		duplicate(a);

	}

}
