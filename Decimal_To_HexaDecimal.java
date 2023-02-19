package Practice_Number_Comversion;

import java.util.*;
public class Decimal_To_HexaDecimal {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int a=sc.nextInt();
		String res="";
		
		while(a!=0) {
			int r=a%16;
			if(a==10) {
				res="a"+res;
			}
			else if(a==11) {
				res="b"+res;
			}
			else if(a==12) {
				res="c"+res;
			}
			else if(a==13) {
				res="d"+res;
			}
			else if(a==14) {
				res="e"+res;
			}
			else if(a==15) {
				res="f"+res;
			}
			else {
				res=r+res;
			}
			a=a/16;
		}
		System.out.println(res);
		
	}

}
