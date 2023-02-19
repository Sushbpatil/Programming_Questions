
/*
 * Decimal Value = Base 10 = 1,2,3,4,5,6,7,8,9
 * Binary Values = Base 2 = 0,1 
 * Octal Values = base 8 = 1,2,3,4,5,6,7
 * HexadecimalValues = Base 16 = 1,2,3,4,5,6,7,8,9,a,b,c,d,e,f
 */

package Practice_Number_Comversion;

import java.util.*;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		String res="";
		Scanner sc=new Scanner (System.in);
		System.out.println("enter dec no");
		int n=sc.nextInt();
		while(n!=0) {
			int r=n%2;
			res=r+res;
			n=n/2;
		}
		System.out.println(res);
		
	}
	}
		
