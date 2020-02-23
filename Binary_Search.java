
public class Binary_Search {
	public static void search(int a[])
	{
	    int start=0;
	    int last=a.length-1;
	    int key=91;
	    int mid=(start+last)/2;
	    while(start<=last)
	    {
	    	if(a[mid]==key)
	    	{
	    		System.out.println("key is found at:"+mid);
	    		break;
	    	}
	    	else if(a[mid]<	key)
	    	{
	    		  start=mid+1;
	    	}
	    	else
	    		last=mid-1;
	    		mid=(start+last)/2; 
	    		
	    }
	
	    if(start> last)

	    {
	    	System.out.println("element not found");
	    }
	}
	public static void main(String[] args) {
		int a[]= {56,21,52,79,91};
		search(a);
	}

}

