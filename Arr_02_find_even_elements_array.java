package array_practice;

public class Arr_02_find_even_elements_array {

	public static void main(String[] args) {
		
	int[] a= {1,2,3,4,5,6,7,8};
	
	for(int i=0;i<a.length;i++)
	{
	    if(a[i]%2==0)
	    {
	    	System.out.println("Even Element: " + a[i]);
	    	
	    }
	    else if(a[i]%2!=0)
	    {
	    	System.out.println("Odd element: " +a[i]);
	    }
	}
}
}
