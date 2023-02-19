package Practice_String;
//Plindrome --> DAD if we reverse we get DAD so it is Palindrome 
public class prgm_02_Palindrome {

	public static void main(String[] args) {
		
		String s="DAD";
		String ref="";
		char [] a=s.toCharArray();
		for (int i = a.length-1; i >= 0; i--) {
			
			ref=ref+a[i];			
		}
		
		if(s.equalsIgnoreCase(ref))
		{
			System.out.println("IT is a Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
		
	}
	
	
}