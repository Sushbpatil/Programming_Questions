package Practice_String;

import java.util.Arrays;

//lex0graphical means alphabetical order(a,b,c....)

public class prgm_09_Strint_into_lexographical {

	public static void main(String[] args) {
		
		String [] a= {"xo","bye","ok","wel"};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i].compareTo(a[j])>0)
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
