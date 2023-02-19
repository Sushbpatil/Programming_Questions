package array_practice;

import java.util.Arrays;

public class arr_22_Reverse_1d_array {

	public static void main(String[] args) {
		
		int [] a= {1,2,3};
		System.out.println(Arrays.toString(a));
		a=reverse(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static int [] reverse (int [] a)
	{
		int [] b=new int [a.length];
		
		int n=a.length;
		for (int i = 0; i < b.length; i++) {
			
			b[i]=a[n-1];
			n--;
		}
		
		return b;
		
	}
	
}
