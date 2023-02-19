package Practice_String;

public class prgrm_05_swap_the_strings {

	
	public static void main(String[] args) {
		
		String k="Sush";
		String p="Patil";
		
		String temp=k;
		k=p;
		p=temp;
		
		System.out.println("k: "+ k);
		System.out.println("p: "+ p);
		
		
		k=k.concat(p);
		//k=k+p;
		
	   p=k.substring(0,k.length()-p.length());
		
		System.out.println("p: "+ p);
		
		k=k.substring(p.length());
		System.out.println("k: "+  k);
		}
	
}
