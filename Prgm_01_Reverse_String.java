package Practice_String;

//Reverse a String 
// convert string to char [] the print last index at first 
public class Prgm_01_Reverse_String {

	public static void main(String[] args) {
		
		String s="sushanT";
		String ref="";
		
		char [] a=s.toCharArray();
		
		for (int i = a.length-1; i >=0; i--) {
			
			ref=ref+a[i];
		}
		System.out.println(ref);
	}
}