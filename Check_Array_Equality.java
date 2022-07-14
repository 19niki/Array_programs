package Git_Array_Programs;


public class Check_Array_Equality {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int b[]= {10,20,30};
		boolean found=true;
		if(a.length==b.length)
		{
		   for(int i=0; i<a.length;i++)
		   {
			   if(a[i] !=b[i])
			   {
				   found=false;
			   }
		   }
		}
		else
			  found=false;
		   
		   if(found)
		   {
			   System.out.println("same");
		   }
		   else
			   System.out.println("not same");
		}

	}

