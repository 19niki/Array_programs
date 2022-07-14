package Git_Array_Programs;

/*
 * Search an element in an array(Linear search)
 */
public class Search_element_in_array {
public static void search(int a[])
		{
	       int pos=0;
	       int count=0;
	       int key=79;
	       for(int i=0; i<a.length;i++)
	       {
	    	   if(a[i]==key)
	    	   {
	    		   pos=i+1;
	    		   count++;
	    	   }
	       }
	       if(count==0)
	       {
	    	   System.out.println("key element nto found");
	       }
	       else
	    	   System.out.println("key element found at:"+pos);
		}
	public static void main(String[] args) {
		int a[]= {56,21,52,79,91};
		search(a);

	}

}
