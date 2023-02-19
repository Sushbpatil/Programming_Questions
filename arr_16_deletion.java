package array_practice;

import java.util.Arrays;

public class arr_16_deletion {

	public static void main(String[] args) {
		
	
	int [] a= {1,2,5,4,8};
	int index=2;
	
	a=deletion(a,index);
	System.out.println(Arrays.toString(a));
}
	public static int [] deletion(int[] a, int index) {
		
		int [] b=new int [a.length-1];
		for (int i = 0; i < b.length; i++) {
			
			if(i<index)
			{
				b[i]=a[i];
				
			}
			else 
			{
				b[i]=a[i+1];
			}
		}
		return b;
		
	}
}
