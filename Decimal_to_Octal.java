
//WAJP to convert decimal into Octal

package Practice_Number_Comversion;
import java.util.*;
public class Decimal_to_Octal {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int a= sc.nextInt();
		String res="";
		while(a!=0) {
			int r=a%8;
			res=r+res;
			a=a/8;
		}
		System.err.println(res);
	}

}
