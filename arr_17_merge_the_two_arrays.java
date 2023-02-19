package array_practice;

import java.util.Arrays;

public class arr_17_merge_the_two_arrays {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4};
		int []b = {5,6,7,8};
		
	 b=merge(a,b);
	 System.out.println(Arrays.toString(b));
}

	public static int [] merge(int[] a, int[] b) {
		
		int [] c=new int [a.length+b.length];
		
		
		
		for (int i = 0; i < a.length; i=i+1) {
			
			c[i]=a[i];
			
		}
		for (int i = 0; i < b.length; i++) {
			
			c[i+a.length]=b[i];
		}
		
		return c;
		
	}
}
