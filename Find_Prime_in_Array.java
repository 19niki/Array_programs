package Git_Array_Programs;

/*
 * To print all the prime in an array
 */
public class Find_Prime_in_Array {

	public static void main(String[] args) {
		int a[]= {3,1,7,8,4,9};
	    int b[]=new int[a.length];
	    int count;
	    for(int i=0; i<a.length;i++)
	    {
	    	 count=0;
	    	for(int j=2;j<i;j++)
	    	{
	    		count++;
	    	}
	    
	    if(count==0)
	    {
	    	b[i]=a[i];
	    	System.out.println("Prime numbers are:"+b[i]);
	    }
	}
	}
}
