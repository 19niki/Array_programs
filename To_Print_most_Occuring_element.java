package Git_Array_Programs;

public class To_Print_most_Occuring_element {

	public static void main(String[] args) {
		int a[]= {5,5,5,4,8,5,4,1,4,6};
		int pop=0;
		int temp=0;
		int count=0;
		for(int i=0; i<a.length;i++)
		{
			temp=a[i];
			int tempcount=0;
			for(int j=0; j<a.length;j++)
			{
				if(temp==a[j])
				{
					tempcount++;
				}
				int b;
				if(tempcount>=count)
				{
					pop=a[i];
					count=tempcount;
				}
			}
		}
   System.out.println(pop+":has occured this many times:"+count);
	}

}
