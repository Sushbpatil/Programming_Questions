package Practice_String;

public class prgm_06_Longest_prefix {

	public static void main(String[] args) {

		String [] a= {"sushant","sus","suphan","suk"};
	      longestPrefix(a);
		
	}

	public static void longestPrefix(String[] a) {
		
		int size=a.length;
		
		if(size==0)
		{
			System.out.println("0 length");
		}
		
		if(size==1)
		{
			System.out.println(a[0]);
		}
		
		//to find end Math.min(first index,last index)
		  int end = Math.min(a[0].length(), a[size-1].length());
		
		  int i=0;
		  while(i<end && a[0].charAt(i)==a[size-1].charAt(i))
		  {
			  i++;
		  }
		  
		  String pr=a[0].substring(0,i);
		  System.out.println(pr);
	}
}
