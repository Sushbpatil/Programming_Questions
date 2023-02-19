package Practice_String;

import java.util.Iterator;

public class prgm_07_String_occurance {

	public static void main(String[] args) {
		
		String str="sushakwg";
		
		char[] a =str.toCharArray();
		boolean b[] = new boolean [a.length];
		
		for (int i = 0; i < b.length; i++) {
			
			if (b[i]==false)
			{
				int count =1;
				for (int j = i+1; j < b.length; j++) {
					
					if(a[i]==a[j])
					{
						count++;
						b[j]=true;
					}
					
				}
				System.out.println(a[i]+" " + count);
			}
		}
		
		
	}
}
